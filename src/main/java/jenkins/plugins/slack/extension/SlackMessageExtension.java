package jenkins.plugins.slack.extension;

import hudson.ExtensionPoint;
import hudson.model.Run;

public abstract class SlackMessageExtension implements ExtensionPoint {

    public String doReplacement(String message, Run build) {
        return message;
    }

}
