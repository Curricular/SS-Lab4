package cn.edu.fudan.se;

/**
 * Created by Dawnwords on 2015/5/24.
 */
public class Parameter {
    public static final String TOPIC = "G1-SelectCourse";
    public static final String INVOKER_CONSUMER_GROUP = "invoker-cG1";
    public static final String INVOKER_PRODUCER_GROUP = "invoker-pG1";
    public static final String INVOKER_KEY = "request";

    public static final String RESPONSOR_CONSUMER_GROUP = "responsor-cG1";
    public static final String RESPONSOR_PRODUCER_GROUP = "responsor-pG1";
    public static final String RESPONSOR_KEY = "response";

    public static final String RESPONSE_TAG = "lecture_response";
    public static final String REQUEST_TAG = "lecture_request";
}
