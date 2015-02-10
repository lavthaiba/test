import geb.Page

/**
 * Created by lavthaiba on 2/4/2015.
 */
class voltDBadmin extends Page {

    static at = { waitFor { showadmin.isDisplayed() }


    }


    static content = {
        showadmin {
            $("a", text: "Admin")


        }

    }


}

