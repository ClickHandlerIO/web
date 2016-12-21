package moment.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class Zone {

    @JsProperty
    public String name; // unique identifier
    @JsProperty
    public String[] abbrs; // abbreviations
    @JsProperty
    public double[] until; // timestamps in milliseconds
    @JsProperty
    public int[] offsets;

    public native String format();
    public native String zoneAbbr();
    public native String zoneName();

    @JsMethod(namespace = "tz")
    public static native String abbr(double timestamp); // get the abbreviation of a given timestamp

    @JsMethod(namespace = "tz")
    public static native String offset(double timestamp);

    @JsMethod(namespace = "tz")
    public static native String parse(double timestamp);

    // format utilities for unpacked and packed, conversions, etc
    @JsMethod(namespace = "tz")
    public static native String pack(Zone unpackedObject);
    @JsMethod(namespace = "tz")
    public static native Zone unpack(String packedString);
    @JsMethod(namespace = "tz")
    public static native String packBase60(int number);
    @JsMethod(namespace = "tz")
    public static native String packBase60(int number, int precision);
    @JsMethod(namespace = "tz")
    public static native double unpackBase60(String base60String);

    // todo create links

    // when not using the Zone object a special string can be used, it follows a specific link format from docs
    @JsMethod(namespace = "tz")
    public static native String add(String packedZoneString);
    @JsMethod(namespace = "tz")
    public static native String add(String[] packedZoneString);
    @JsMethod(namespace = "tz")
    public static native String link(String packedZoneString);
    @JsMethod(namespace = "tz")
    public static native String link(String[] packedZoneString);


}

/*
    example of bottom methods here
    moment.tz.zone("UnloadedZone"); // null
    moment.tz.add("UnloadedZone|UZ|0|0|");
    moment.tz.zone("UnloadedZone"); // returns zone
 */