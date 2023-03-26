using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class HomePage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void insertClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("Insert.aspx");
            
        }

        protected void retriveClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("RetrivePage.aspx");
        }

        protected void updateClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("updatePage.aspx");
        }

        protected void deleteClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("deletePage.aspx");
        }
    }
}