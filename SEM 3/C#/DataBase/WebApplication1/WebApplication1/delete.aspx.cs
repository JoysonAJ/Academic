using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class delete : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\DataBase\WebApplication1\WebApplication1\App_Data\Database1.mdf"";Integrated Security=True");
                con.Open();
                SqlCommand cmd = new SqlCommand("SELECT Pid, Productname,Price FROM Product", con);
                SqlDataReader dr = cmd.ExecuteReader();
                ddlProduct.DataSource = dr;
                ddlProduct.DataTextField = "ProductName";
                ddlProduct.DataValueField = "Pid";
                ddlProduct.DataBind();
                ddlProduct.Items.Insert(0, new ListItem("Select"));
            }
        }

        static int pid;
        protected void ddlProduct_selectIndexchanged(object sender, EventArgs e)
        {
            pid = int.Parse(ddlProduct.SelectedValue);
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\DataBase\WebApplication1\WebApplication1\App_Data\Database1.mdf"";Integrated Security=True");
            con.Open();
            SqlCommand cmd = new SqlCommand("SELECT Pid, Productname,Price FROM Product WHERE Pid=" + pid, con);
            SqlDataReader dr = cmd.ExecuteReader();
            while (dr.Read())
            {
                TextBox1.Text = dr.GetString(1);
                TextBox2.Text = dr.GetInt32(2).ToString();
            }
        }

            protected void Button3_Click(object sender, EventArgs e)
        {
            Response.Redirect("retrive.apsx");
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("Home.aspx");
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            String pname = TextBox1.Text;
            int price = int.Parse(TextBox2.Text);
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\DataBase\WebApplication1\WebApplication1\App_Data\Database1.mdf"";Integrated Security=True");
            con.Open();
            SqlCommand cmd = new SqlCommand("DELETE FROM Product WHERE Pid=" + pid, con);
            cmd.ExecuteNonQuery();
            con.Close();
            Response.Write("Deleted Successfully");
        }
    }
}