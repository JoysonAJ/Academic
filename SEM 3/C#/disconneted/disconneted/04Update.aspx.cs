using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Drawing;

namespace disconneted
{
    public partial class _04Update : System.Web.UI.Page
    {
        SqlConnection sqlConnection = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\disconneted\disconneted\App_Data\Database1.mdf"";Integrated Security=True");
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                sqlConnection.Open();
                SqlDataAdapter DA = new SqlDataAdapter("SELECT Pid, ProductName,Price " +
                    "FROM Product", sqlConnection);
                DataSet DS = new DataSet();
                DA.Fill(DS);

                ddlProduct.DataSource = DS;
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
            sqlConnection.Open();
            SqlDataAdapter DA = new SqlDataAdapter("SELECT ProductName,Price " +
                "from Product WHERE Pid=" + pid,sqlConnection );
           // SqlCommandBuilder BLDR = new SqlCommandBuilder(DA);
            DataSet DS = new DataSet();
            DA.Fill(DS);
            TextBox1.Text = DS.Tables[0].Rows[0][0].ToString();
            TextBox2.Text = DS.Tables[0].Rows[0][1].ToString();
        }

        protected void Update_Click(object sender, EventArgs e)
        {
            String pname = TextBox1.Text;
            int price = int.Parse(TextBox2.Text);
            sqlConnection.Open();
            SqlDataAdapter DA = new SqlDataAdapter("UPDATE Product " +
                "SET ProductName='" + pname + "',Price=" + price + 
                " WHERE Pid=" + pid, sqlConnection);
            //SqlCommandBuilder BLDR = new SqlCommandBuilder(DA);
            DataSet DS = new DataSet("Product");
            DA.Fill(DS, "Product");
            Response.Write("Updated Successfully");
        }

        protected void backHome_Click(object sender, EventArgs e)
        {
            Response.Redirect("02Home.aspx");
        }

        protected void Display_Click(object sender, EventArgs e)
        {
            Response.Redirect("03Retrive.aspx");
        }

    }
}