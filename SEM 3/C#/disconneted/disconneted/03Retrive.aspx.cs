using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace disconneted
{
    public partial class _03Retrive : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            SqlConnection sqlConnection = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\disconneted\disconneted\App_Data\Database1.mdf"";Integrated Security=True");
            sqlConnection.Open();

            SqlDataAdapter sqlDataAdapter = new SqlDataAdapter("SELECT * FROM " +
                "Product", sqlConnection);

            DataSet DS = new DataSet();
            sqlDataAdapter.Fill(DS);
            //Response.Write(sqlDataAdapter.ToString());
            GridView1.DataSource = DS;
            GridView1.DataBind();
            sqlConnection.Close();
        }
        protected void Home_Click(object sender, EventArgs e)
        {
            Response.Redirect("02Home.aspx");
        }
    }
}