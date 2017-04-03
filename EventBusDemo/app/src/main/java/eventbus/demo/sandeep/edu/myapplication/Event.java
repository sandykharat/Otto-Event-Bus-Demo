package eventbus.demo.sandeep.edu.myapplication;

interface EventListener {

    public String getMessage();
}

/**
 * Created by sandeep_kharat on 3/30/2017.
 */

public class Event {
    public static class FragmentActivityMessage implements EventListener {

        String message;

        public FragmentActivityMessage(String message) {
            this.message = message;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }

    public static class ActivityFragmentMessage implements EventListener {
        String message;

        public ActivityFragmentMessage(String message) {
            this.message = message;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }
}
