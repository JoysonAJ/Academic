using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;

namespace WebApplication1
{
    public partial class insert : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            String pr_name = text1.Text;
            int price = int.Parse(tex2.Text);

            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\DataBase\WebApplication1\WebApplication1\App_Data\Database1.mdf"";Integrated Security=True");
            con.Open();

            SqlCommand cmd = new SqlCommand("insert into Product(Productname,Price)" +
                "VALUES('"+ pr_name+"',"+ price+")",con);
            cmd.ExecuteNonQuery();
            con.Close();
            Response.Write("Inserted Sucessfully");
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            Response.Redirect("Home.aspx");
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("Retrieve.aspx");
        }
    }
}