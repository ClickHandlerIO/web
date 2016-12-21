package moment.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class Duration {

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Created by Moment class, but has several own functions including a couple static
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public native String humanize();
    public native int milliseconds();
    public native int asMilliseconds();
    public native int seconds();
    public native int asSeconds();
    public native int minutes();
    public native int asMinutes();
    public native int hours();
    public native int asHours();
    public native int days();
    public native int asDays();
    public native int months();
    public native int asMonths();
    public native int years();
    public native int asYears();
    public native Duration toJSON();


    @JsMethod(namespace = "duration")
    public static native Duration as(String unitOfTime);
    // Get method
    @JsMethod(namespace = "duration")
    public static native Duration get(String unitOfTime);


    // can call other methods like add and subtract on a duration instance
    public native Duration add(int amount, String key);
    public native Duration add(int amount);
    public native Duration add(Duration duration);
    public native Duration add(Object object);

    public native Duration substract(int amount, String key);
    public native Duration substract(int amount);
    public native Duration substract(Duration duration);
    public native Duration substract(Object object);
}
