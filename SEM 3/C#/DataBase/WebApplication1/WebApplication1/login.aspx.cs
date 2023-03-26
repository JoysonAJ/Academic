using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string uname, pswd;
            uname = TextBoxUserName.Text;
            pswd = TextBoxPassword.Text;
            if (uname.Equals("aimit") && pswd.Equals("it"))
            {
                Session["username"] = uname;
                Response.Redirect("Home.aspx");
            }
            else
            {
                Response.Write("login failed!!! Try again");
            }

           
        }
    }
}