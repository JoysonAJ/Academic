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
    public partial class _05Delete : System.Web.UI.Page
    {
        SqlConnection sqlConnection = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\disconneted\disconneted\App_Data\Database1.mdf"";Integrated Security=True");
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                sqlConnection.Open();
                SqlDataAdapter DA = new SqlDataAdapter("SELECT Pid, ProductName,Price " +
                    "FROM Product",sqlConnection);
                DataSet DS = new DataSet();
                DA.Fill(DS);    

                ddlProduct.DataSource= DS;
                ddlProduct.DataTextField = "ProductName";
                ddlProduct.DataValueField = "Pid";
                ddlProduct.DataBind();
                ddlProduct.Items.Insert(0, new ListItem("Select"));

            }
        }
        static int pid;

        protected void dlProduct_selectIndexchanged(object sender, EventArgs e)
        {
            pid = int.Parse(ddlProduct.SelectedValue);
            sqlConnection.Open();
            SqlDataAdapter DA = new SqlDataAdapter("SELECT Productname,Price from Product WHERE Pid=" + pid, sqlConnection);
            SqlCommandBuilder BLDR = new SqlCommandBuilder(DA);
            DataSet DS = new DataSet();//dataset is a collection of tables
            DA.Fill(DS);
            TextBox1.Text = DS.Tables[0].Rows[0][0].ToString();//table[0] is first table in dataset,rows[0][0]->1st row in the firstdatatable,first column
            TextBox2.Text = DS.Tables[0].Rows[0][1].ToString();
        }
        protected void Delete_Click(object sender, EventArgs e)
        {
            String pname = TextBox1.Text;
            int price = int.Parse(TextBox2.Text);
            sqlConnection.Open();
            SqlDataAdapter DA = new SqlDataAdapter("DELETE FROM " +
                "Product WHERE Pid=" + pid, sqlConnection);
            SqlCommandBuilder BLDR = new SqlCommandBuilder(DA);
            DataSet DS = new DataSet();
            DA.Fill(DS);
            Response.Write("Deleted Successfully");

        }

        protected void Display_Click(object sender, EventArgs e)
        {
            Response.Redirect("03Retrive.aspx");
        }

        protected void Home_Click(object sender, EventArgs e)
        {
            Response.Redirect("02Home.aspx");
        }
    }
}