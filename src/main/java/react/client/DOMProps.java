package react.client;

import common.client.Func;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType
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

    @JsIgnore
    public Object children() {
        return this.children;
    }

    @JsIgnore
    public Object key() {
        return this.key;
    }

    @JsIgnore
    public DOMProps<T> children(final Object children) {
        this.children = children;
        return this;
    }

    @JsIgnore
    public DOMProps<T> key(final Object key) {
        this.key = key;
        return this;
    }

    @JsIgnore
    public DOMProps<T> ref(String ref) {
        this.ref = ref;
        return this;
    }

    @JsIgnore
    public DOMProps<T> ref(Func.Run1<T> ref) {
        this.ref = ref;
        return this;
    }

    @JsIgnore
    public DOMProps<T> ref(final Ref<T> ref) {
        if (ref == null) {
            return this;
        }
        this.ref = ref.getName();
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCopy(ClipboardEventHandler value) {
        this.onCopy = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCut(ClipboardEventHandler value) {
        this.onCut = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPaste(ClipboardEventHandler value) {
        this.onPaste = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCompositionEnd(CompositionEventHandler value) {
        this.onCompositionEnd = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCompositionStart(CompositionEventHandler value) {
        this.onCompositionStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCompositionUpdate(CompositionEventHandler value) {
        this.onCompositionUpdate = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onFocus(FocusEventHandler value) {
        this.onFocus = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onBlur(FocusEventHandler value) {
        this.onBlur = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onChange(FormEventHandler value) {
        this.onChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onInput(FormEventHandler value) {
        this.onInput = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSubmit(FormEventHandler value) {
        this.onSubmit = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoad(ReactEventHandler value) {
        this.onLoad = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onError(ReactEventHandler value) {
        this.onError = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onKeyDown(KeyboardEventHandler value) {
        this.onKeyDown = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onKeyPress(KeyboardEventHandler value) {
        this.onKeyPress = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onKeyUp(KeyboardEventHandler value) {
        this.onKeyUp = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onAbort(ReactEventHandler value) {
        this.onAbort = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCanPlay(ReactEventHandler value) {
        this.onCanPlay = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onCanPlayThrough(ReactEventHandler value) {
        this.onCanPlayThrough = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDurationChange(ReactEventHandler value) {
        this.onDurationChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onEmptied(ReactEventHandler value) {
        this.onEmptied = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onEncrypted(ReactEventHandler value) {
        this.onEncrypted = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onEnded(ReactEventHandler value) {
        this.onEnded = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoadedData(ReactEventHandler value) {
        this.onLoadedData = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoadedMetadata(ReactEventHandler value) {
        this.onLoadedMetadata = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onLoadStart(ReactEventHandler value) {
        this.onLoadStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPause(ReactEventHandler value) {
        this.onPause = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPlay(ReactEventHandler value) {
        this.onPlay = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onPlaying(ReactEventHandler value) {
        this.onPlaying = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onProgress(ReactEventHandler value) {
        this.onProgress = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onRateChange(ReactEventHandler value) {
        this.onRateChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSeeked(ReactEventHandler value) {
        this.onSeeked = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSeeking(ReactEventHandler value) {
        this.onSeeking = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onStalled(ReactEventHandler value) {
        this.onStalled = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSuspend(ReactEventHandler value) {
        this.onSuspend = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTimeUpdate(ReactEventHandler value) {
        this.onTimeUpdate = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onVolumeChange(ReactEventHandler value) {
        this.onVolumeChange = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onWaiting(ReactEventHandler value) {
        this.onWaiting = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onClick(MouseEventHandler value) {
        this.onClick = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onContextMenu(MouseEventHandler value) {
        this.onContextMenu = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDoubleClick(MouseEventHandler value) {
        this.onDoubleClick = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDrag(DragEventHandler value) {
        this.onDrag = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragEnd(DragEventHandler value) {
        this.onDragEnd = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragEnter(DragEventHandler value) {
        this.onDragEnter = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragExit(DragEventHandler value) {
        this.onDragExit = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragLeave(DragEventHandler value) {
        this.onDragLeave = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragOver(DragEventHandler value) {
        this.onDragOver = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDragStart(DragEventHandler value) {
        this.onDragStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onDrop(DragEventHandler value) {
        this.onDrop = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseDown(MouseEventHandler value) {
        this.onMouseDown = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseEnter(MouseEventHandler value) {
        this.onMouseEnter = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseLeave(MouseEventHandler value) {
        this.onMouseLeave = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseMove(MouseEventHandler value) {
        this.onMouseMove = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseOut(MouseEventHandler value) {
        this.onMouseOut = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseOver(MouseEventHandler value) {
        this.onMouseOver = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onMouseUp(MouseEventHandler value) {
        this.onMouseUp = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onSelect(ReactEventHandler value) {
        this.onSelect = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchCancel(TouchEventHandler value) {
        this.onTouchCancel = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchEnd(TouchEventHandler value) {
        this.onTouchEnd = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchMove(TouchEventHandler value) {
        this.onTouchMove = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onTouchStart(TouchEventHandler value) {
        this.onTouchStart = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onScroll(UIEventHandler value) {
        this.onScroll = value;
        return this;
    }

    @JsIgnore
    public DOMProps<T> onWheel(WheelEventHandler value) {
        this.onWheel = value;
        return this;
    }
}
