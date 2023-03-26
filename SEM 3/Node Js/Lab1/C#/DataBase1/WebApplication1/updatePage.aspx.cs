using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class updatePage : System.Web.UI.Page
    {

        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=E:\Lab\C#\DataBase1\WebApplication1\App_Data\Database1.mdf;Integrated Security=True");
                con.Open();
                SqlCommand cmd = new SqlCommand("SELECT regno,fname,lname FROM std", con);
                SqlDataReader dr = cmd.ExecuteReader();
                studentList.DataSource = dr;
                studentList.DataTextField = "fname";
                studentList.DataValueField = "regno";
                studentList.DataBind();
                studentList.Items.Insert(0, new ListItem("Select"));
            }


        }
        
        static string studentRegNo;
        protected void selected_registerNumber(object sender, EventArgs e)
        {
            studentRegNo = (studentList.SelectedValue);
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=E:\Lab\C#\DataBase1\WebApplication1\App_Data\Database1.mdf;Integrated Security=True");
            con.Open();
            SqlCommand cmd = new SqlCommand("SELECT regno,fname,lname FROM std where regno= '"+ studentRegNo + "';", con);
            SqlDataReader dr = cmd.ExecuteReader();
        }

        protected void HomePage_Click(object sender, EventArgs e)
        {
            Response.Redirect("HomePage.aspx");
        }

        protected void upClick_Click(object sender, EventArgs e)
        {
            string lastName = lnameUp.Text;
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=E:\Lab\C#\DataBase1\WebApplication1\App_Data\Database1.mdf;Integrated Security=True");
            con.Open();
            SqlCommand cmd = new SqlCommand("UPDATE std SET " +
                "lname='"+lastName+"' WHERE  regno ='"+ studentRegNo + "'", con);

            int rowsAffeted = cmd.ExecuteNonQuery();
            con.Close();
            if (rowsAffeted > 0)
            {
                Response.Write("Updated Successfully");
            }
            else
            {
                Response.Write("NOT UPDATED");
            }
        }
    }
}