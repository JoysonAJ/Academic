using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
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


            SqlConnection sqlConnection = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=E:\Lab\C#\DataBase1\WebApplication1\App_Data\Database1.mdf;Integrated Security=True");
            sqlConnection.Open();

            string firstName = fname.Text;
            string lastName = lname.Text;
            string registerNumber = regno.Text;

            SqlCommand sqlCommand = new SqlCommand("INSERT INTO std(regno,fname,lname) VALUES " +
                "('" + registerNumber + "','" + firstName + "','" + lastName + "')", sqlConnection);

            sqlCommand.ExecuteNonQuery();
            sqlConnection.Close();

            Response.Write("saved Sucessfulll");

        }
    }
}