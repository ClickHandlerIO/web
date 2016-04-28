package ui.client.select2;

import com.google.gwt.dom.client.NativeEvent;
import common.client.Func;
import ui.client.select2.events.Select2EventArgs;
import ui.client.select2.events.Select2EventParams;
import ui.client.select2.events.Select2NativeEvent;
import jsinterop.annotations.JsType;

@JsType
public class Select2Events {
    public Func.Run1<NativeEvent> onChange;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onOpening;
    public Func.Run1<NativeEvent> onOpen;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onClosing;
    public Func.Run1<NativeEvent> onClose;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onSelecting;
    public Func.Run1<Select2NativeEvent<Select2EventArgs>> onSelect;
    public Func.Run1<Select2NativeEvent<Select2EventParams>> onUnselecting;
    public Func.Run1<Select2NativeEvent<Select2EventArgs>> onUnselect;
}
