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
    public partial class Insert : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void homeCLick_Click(object sender, EventArgs e)
        {
            Response.Redirect("HomePage.aspx");
        }

        protected void insertClick_Click(object sender, EventArgs e)
        {
            SqlConnection sqlConnection = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=E:\Lab\C#\database2\database2\App_Data\Database1.mdf;Integrated Security=True");
            sqlConnection.Open();

            string regNo = regno.Text;
            string name= fullname.Text;

            SqlDataAdapter sqlDataAdapter = new SqlDataAdapter("INSERT INTO std(reg,std_name) VALUES " +
                "('" + regNo + "','" + name + "')", sqlConnection);
            SqlCommandBuilder sqlCommandBuilder = new SqlCommandBuilder(sqlDataAdapter);
            DataSet dataSet = new DataSet();
            sqlDataAdapter.Fill(dataSet, "std");
            Response.Write("Inserted Sucessfully");

        }
    }
}