package react.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class DOMProps<T> {
    @JsProperty
    public Object children;
    @JsProperty
    public Object key;
    @JsProperty
    public Object ref;
    @JsProperty
    public ClipboardEventHandler onCopy;
    @JsProperty
    public ClipboardEventHandler onCut;
    @JsProperty
    public ClipboardEventHandler onPaste;
    @JsProperty
    public CompositionEventHandler onCompositionEnd;
    @JsProperty
    public CompositionEventHandler onCompositionStart;
    @JsProperty
    public CompositionEventHandler onCompositionUpdate;
    @JsProperty
    public FocusEventHandler onFocus;
    @JsProperty
    public FocusEventHandler onBlur;
    @JsProperty
    public FormEventHandler onChange;
    @JsProperty
    public FormEventHandler onInput;
    @JsProperty
    public FormEventHandler onSubmit;
    @JsProperty
    public ReactEventHandler onLoad;
    @JsProperty
    public ReactEventHandler onError;
    @JsProperty
    public KeyboardEventHandler onKeyDown;
    @JsProperty
    public KeyboardEventHandler onKeyPress;
    @JsProperty
    public KeyboardEventHandler onKeyUp;
    @JsProperty
    public ReactEventHandler onAbort;
    @JsProperty
    public ReactEventHandler onCanPlay;
    @JsProperty
    public ReactEventHandler onCanPlayThrough;
    @JsProperty
    public ReactEventHandler onDurationChange;
    @JsProperty
    public ReactEventHandler onEmptied;
    @JsProperty
    public ReactEventHandler onEncrypted;
    @JsProperty
    public ReactEventHandler onEnded;
    @JsProperty
    public ReactEventHandler onLoadedData;
    @JsProperty
    public ReactEventHandler onLoadedMetadata;
    @JsProperty
    public ReactEventHandler onLoadStart;
    @JsProperty
    public ReactEventHandler onPause;
    @JsProperty
    public ReactEventHandler onPlay;
    @JsProperty
    public ReactEventHandler onPlaying;
    @JsProperty
    public ReactEventHandler onProgress;
    @JsProperty
    public ReactEventHandler onRateChange;
    @JsProperty
    public ReactEventHandler onSeeked;
    @JsProperty
    public ReactEventHandler onSeeking;
    @JsProperty
    public ReactEventHandler onStalled;
    @JsProperty
    public ReactEventHandler onSuspend;
    @JsProperty
    public ReactEventHandler onTimeUpdate;
    @JsProperty
    public ReactEventHandler onVolumeChange;
    @JsProperty
    public ReactEventHandler onWaiting;
    @JsProperty
    public MouseEventHandler onClick;
    @JsProperty
    public MouseEventHandler onContextMenu;
    @JsProperty
    public MouseEventHandler onDoubleClick;
    @JsProperty
    public DragEventHandler onDrag;
    @JsProperty
    public DragEventHandler onDragEnd;
    @JsProperty
    public DragEventHandler onDragEnter;
    @JsProperty
    public DragEventHandler onDragExit;
    @JsProperty
    public DragEventHandler onDragLeave;
    @JsProperty
    public DragEventHandler onDragOver;
    @JsProperty
    public DragEventHandler onDragStart;
    @JsProperty
    public DragEventHandler onDrop;
    @JsProperty
    public MouseEventHandler onMouseDown;
    @JsProperty
    public MouseEventHandler onMouseEnter;
    @JsProperty
    public MouseEventHandler onMouseLeave;
    @JsProperty
    public MouseEventHandler onMouseMove;
    @JsProperty
    public MouseEventHandler onMouseOut;
    @JsProperty
    public MouseEventHandler onMouseOver;
    @JsProperty
    public MouseEventHandler onMouseUp;
    @JsProperty
    public ReactEventHandler onSelect;
    @JsProperty
    public TouchEventHandler onTouchCancel;
    @JsProperty
    public TouchEventHandler onTouchEnd;
    @JsProperty
    public TouchEventHandler onTouchMove;
    @JsProperty
    public TouchEventHandler onTouchStart;
    @JsProperty
    public UIEventHandler onScroll;
    @JsProperty
    public WheelEventHandler onWheel;

    @JsOverlay
    public final Object children() {
        return this.children;
    }

    @JsOverlay
    public final Object key() {
        return this.key;
    }
}
