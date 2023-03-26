using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace database2
{
    public partial class HomePage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void insertClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("insert.aspx");
        }

        protected void retriveClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("retrive.aspx");
        }

        protected void updateClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("update.aspx");
        }

        protected void deleteClick_Click(object sender, EventArgs e)
        {
            Response.Redirect("delete.aspx");
        }
    }
}