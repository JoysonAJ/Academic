using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace database2
{
    public partial class delete : System.Web.UI.Page
    {
        SqlConnection sqlConnection = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=E:\Lab\C#\database2\database2\App_Data\Database1.mdf;Integrated Security=True");

        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter("SELECT reg,std_name FROM std", sqlConnection);
                SqlCommandBuilder sqlCommandBuilder = new SqlCommandBuilder(sqlDataAdapter);
                DataSet dataSet = new DataSet();
                sqlDataAdapter.Fill(dataSet, "std");
                studentList.DataSource = dataSet;
                studentList.DataTextField = "std_name";
                studentList.DataValueField = "reg";
                studentList.DataBind();
                studentList.Items.Insert(0, new ListItem("Select"));
            }
        }
        static string studentRegNo;
        protected void selected_registerNumber(object sender, EventArgs e)
        {
            studentRegNo = studentList.SelectedValue;
            sqlConnection.Open();
            SqlDataAdapter sqlDataAdapter = new SqlDataAdapter("SELECT reg,std_name FROM std", sqlConnection);
            SqlCommandBuilder sqlCommandBuilder = new SqlCommandBuilder(sqlDataAdapter);
            DataSet dataSet = new DataSet();
            sqlDataAdapter.Fill(dataSet);
        }

        protected void HomeClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("HomePage.aspx");
        }

        protected void deleteClick_Click(object sender, EventArgs e)
        {
            sqlConnection.Open();
            SqlDataAdapter sqlDataAdapter = new SqlDataAdapter("DELETE FROM std " +
                "WHERE reg='" + studentRegNo + "'", sqlConnection);
            SqlCommandBuilder sqlCommandBuilder = new SqlCommandBuilder(sqlDataAdapter);
            DataSet dataSet = new DataSet();
            sqlDataAdapter.Fill(dataSet, "std");
            Response.Write("Deleted ....");
        }
    }
}