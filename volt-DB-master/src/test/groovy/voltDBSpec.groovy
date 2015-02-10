import geb.spock.GebReportingSpec
import voltDBadmin
import voltDBhome


/**
 * Created by lavthaiba on 2/2/2015.
 */
class voltDBSpec extends GebReportingSpec {



    def "popup test"() {

        given:
        to voltDBhome

        def $line
        new File("src/test/groovy/users.txt").withReader { $line = it.readLine() }

        when: "submitted"

                loginBoxuser1.value($line)
                loginBoxuser2.value($line)
                loginbtn.click()


      //  loginBoxinvalid.click()

        //empty username and empty password
      /*if ( loginBoxuser1.value("") &&
        loginBoxuser2.value("")&&
        loginbtn.click()){println('empty username and empty password')}


        //correct username and wrong password
        if(loginBoxuser1.value("deerwalk")&&
        loginBoxuser2.value("deer")&&
        loginbtn.click()) {println('correct username and wrong password')}

        //correct username and empty password
        if(loginBoxuser1.value("deerwalk")&&
        loginBoxuser2.value("")&&
        loginbtn.click()){println('correct username and empty password')}

        //incorrect username and correct password
        if(loginBoxuser1.value("deer")&&
        loginBoxuser2.value("deerwalk")&&
        loginbtn.click()){println('incorrect username and correct password')}

        //empty username and correct password
        if(loginBoxuser1.value("")&&
        loginBoxuser2.value("deerwalk")&&
        loginbtn.click()){println('empty username and correct password')}

        //empty username and incorrect password
       if(loginBoxuser1.value("")&&
        loginBoxuser2.value("deer")&&
        loginbtn.click()){println('empty username and incorrect password')}


        //incorrect username and incorrect password
        if(loginBoxuser1.value("deer")&&
        loginBoxuser2.value("deer")&&
        loginbtn.click()){println('incorrect username and incorrect password')}

        //correct username and correct password
        if(loginBoxuser1.value("deerwalk")&&
        loginBoxuser2.value("deerwalk")&&
        loginbtn.click()){println('correct username and correct password')}
*/

        at voltDBadmin
        showadmin.click()
        then:

       at voltDBadmin


    }

}

