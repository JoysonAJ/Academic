using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace disconneted
{
    public partial class _02Home : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Insert_Click(object sender, EventArgs e)
        {
            Response.Redirect("06Insert.aspx");
        }

        protected void Delete_Click(object sender, EventArgs e)
        {
            Response.Redirect("05Delete.aspx");
        }

        protected void Retrive_Click(object sender, EventArgs e)
        {
            Response.Redirect("03Retrive.aspx");
        }

        protected void Update_Click(object sender, EventArgs e)
        {
            Response.Redirect("04Update.aspx");
        }
    }
}