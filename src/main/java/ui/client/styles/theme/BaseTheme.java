package ui.client.styles.theme;

import jsinterop.annotations.JsType;
import ui.client.styles.Spacing;

@JsType(isNative = true)
public class BaseTheme {
    public Spacing spacing;
    public String fontFamily;
    public BaseThemePalette palette;
}