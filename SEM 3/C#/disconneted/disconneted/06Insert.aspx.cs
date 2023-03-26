using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace disconneted
{
    public partial class _06Insert : System.Web.UI.Page
    {
        SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=""E:\COLLEGE\Academic\SEM 3\C#\disconneted\disconneted\App_Data\Database1.mdf"";Integrated Security=True");

        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Home_Click(object sender, EventArgs e)
        {
            Response.Redirect("02Home.aspx");
        }

        protected void Display_Click(object sender, EventArgs e)
        {
            Response.Redirect("03Retrive.aspx");
        }

        protected void Insert_Click(object sender, EventArgs e)
        {
            con.Open();
            String pr_name = TextBox1.Text;
            int price = int.Parse(TextBox2.Text);

            SqlDataAdapter DA = new SqlDataAdapter("INSERT INTO Product " +
                "(ProductName,Price) " +
                "VALUES('"+pr_name+"',"+price+")",con);
           //SqlCommandBuilder BLDR = new SqlCommandBuilder(DA);
            
            DataSet DS = new DataSet();
            DA.Fill(DS,"Product");

            Response.Write("Inserted Successfully");

        }
    }
}