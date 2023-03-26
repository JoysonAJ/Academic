using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace database2
{
    public partial class retrive : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            SqlConnection sqlConnection = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=E:\Lab\C#\database2\database2\App_Data\Database1.mdf;Integrated Security=True");
            sqlConnection.Open();

            SqlDataAdapter sqlDataAdapter = new SqlDataAdapter("SELECT * FROM std", sqlConnection);

            DataSet dataSet = new DataSet();
            sqlDataAdapter.Fill(dataSet, "std");
            GridView1.DataSource = dataSet;
            GridView1.DataBind();
        }

        protected void HomeClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("HomePage.aspx");
        }
    }
}