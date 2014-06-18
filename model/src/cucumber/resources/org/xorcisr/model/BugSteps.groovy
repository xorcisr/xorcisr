package org.xorcisr.model

import cucumber.api.PendingException
import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks

/**
 *
 */

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Given(~'^a new bug$') {->
    // Express the Regexp above with the code you wish you had
    throw new PendingException()
}

Then(~'^I should see a "([^"]*)" property$') { String arg1 ->
    // Express the Regexp above with the code you wish you had
    throw new PendingException()
}
