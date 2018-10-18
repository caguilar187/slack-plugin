package jenkins.plugins.slack.extension;

import hudson.ExtensionPoint;
import hudson.model.AbstractBuild;
import hudson.model.Run;

public abstract class SlackMessageExtension implements ExtensionPoint {

    public String doReplacement(String message, Run build) {
        return message;
    }

    public final String doReplacement(String message, AbstractBuild build) {
        return doReplacement(message, (Run) build);
    }

}
