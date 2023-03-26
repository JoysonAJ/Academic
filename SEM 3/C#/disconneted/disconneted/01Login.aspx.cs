using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace disconneted
{
    public partial class _01Login : System.Web.UI.Page
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
                Response.Redirect("02Home.aspx");
            }
            else
            {
                Response.Write("login failed!!! Try again");
            }
        }
    }
}