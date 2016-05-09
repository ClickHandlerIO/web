package react.client;

import common.client.Func;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class DOMProps {
    @JsProperty
    public Object children;
    @JsProperty
    public Object key;
    @JsProperty
    public Object ref;
    @JsProperty
    public Func.Run1<ClipboardEvent> onCopy;
    @JsProperty
    public Func.Run1<ClipboardEvent> onCut;
    @JsProperty
    public Func.Run1<ClipboardEvent> onPaste;
    @JsProperty
    public Func.Run1<CompositionEvent> onCompositionEnd;
    @JsProperty
    public Func.Run1<CompositionEvent> onCompositionStart;
    @JsProperty
    public Func.Run1<CompositionEvent> onCompositionUpdate;
    @JsProperty
    public Func.Run1<FocusEvent> onFocus;
    @JsProperty
    public Func.Run1<FocusEvent> onBlur;
    @JsProperty
    public Func.Run1<FormEvent> onChange;
    @JsProperty
    public Func.Run1<FormEvent> onInput;
    @JsProperty
    public Func.Run1<FormEvent> onSubmit;
    @JsProperty
    public Func.Run1<SyntheticEvent> onLoad;
    @JsProperty
    public Func.Run1<SyntheticEvent> onError;
    @JsProperty
    public Func.Run1<KeyboardEvent> onKeyDown;
    @JsProperty
    public Func.Run1<KeyboardEvent> onKeyPress;
    @JsProperty
    public Func.Run1<KeyboardEvent> onKeyUp;
    @JsProperty
    public Func.Run1<SyntheticEvent> onAbort;
    @JsProperty
    public Func.Run1<SyntheticEvent> onCanPlay;
    @JsProperty
    public Func.Run1<SyntheticEvent> onCanPlayThrough;
    @JsProperty
    public Func.Run1<SyntheticEvent> onDurationChange;
    @JsProperty
    public Func.Run1<SyntheticEvent> onEmptied;
    @JsProperty
    public Func.Run1<SyntheticEvent> onEncrypted;
    @JsProperty
    public Func.Run1<SyntheticEvent> onEnded;
    @JsProperty
    public Func.Run1<SyntheticEvent> onLoadedData;
    @JsProperty
    public Func.Run1<SyntheticEvent> onLoadedMetadata;
    @JsProperty
    public Func.Run1<SyntheticEvent> onLoadStart;
    @JsProperty
    public Func.Run1<SyntheticEvent> onPause;
    @JsProperty
    public Func.Run1<SyntheticEvent> onPlay;
    @JsProperty
    public Func.Run1<SyntheticEvent> onPlaying;
    @JsProperty
    public Func.Run1<SyntheticEvent> onProgress;
    @JsProperty
    public Func.Run1<SyntheticEvent> onRateChange;
    @JsProperty
    public Func.Run1<SyntheticEvent> onSeeked;
    @JsProperty
    public Func.Run1<SyntheticEvent> onSeeking;
    @JsProperty
    public Func.Run1<SyntheticEvent> onStalled;
    @JsProperty
    public Func.Run1<SyntheticEvent> onSuspend;
    @JsProperty
    public Func.Run1<SyntheticEvent> onTimeUpdate;
    @JsProperty
    public Func.Run1<SyntheticEvent> onVolumeChange;
    @JsProperty
    public Func.Run1<SyntheticEvent> onWaiting;
    @JsProperty
    public Func.Run1<MouseEvent> onClick;
    @JsProperty
    public Func.Run1<MouseEvent> onContextMenu;
    @JsProperty
    public Func.Run1<MouseEvent> onDoubleClick;
    @JsProperty
    public Func.Run1<DragEvent> onDrag;
    @JsProperty
    public Func.Run1<DragEvent> onDragEnd;
    @JsProperty
    public Func.Run1<DragEvent> onDragEnter;
    @JsProperty
    public Func.Run1<DragEvent> onDragExit;
    @JsProperty
    public Func.Run1<DragEvent> onDragLeave;
    @JsProperty
    public Func.Run1<DragEvent> onDragOver;
    @JsProperty
    public Func.Run1<DragEvent> onDragStart;
    @JsProperty
    public Func.Run1<DragEvent> onDrop;
    @JsProperty
    public Func.Run1<MouseEvent> onMouseDown;
    @JsProperty
    public Func.Run1<MouseEvent> onMouseEnter;
    @JsProperty
    public Func.Run1<MouseEvent> onMouseLeave;
    @JsProperty
    public Func.Run1<MouseEvent> onMouseMove;
    @JsProperty
    public Func.Run1<MouseEvent> onMouseOut;
    @JsProperty
    public Func.Run1<MouseEvent> onMouseOver;
    @JsProperty
    public Func.Run1<MouseEvent> onMouseUp;
    @JsProperty
    public Func.Run1<SyntheticEvent> onSelect;
    @JsProperty
    public Func.Run1<TouchEvent> onTouchCancel;
    @JsProperty
    public Func.Run1<TouchEvent> onTouchEnd;
    @JsProperty
    public Func.Run1<TouchEvent> onTouchMove;
    @JsProperty
    public Func.Run1<TouchEvent> onTouchStart;
    @JsProperty
    public Func.Run1<UIEvent> onScroll;
    @JsProperty
    public Func.Run1<WheelEvent> onWheel;

    @JsOverlay
    public final ReactElement children() {
        return (ReactElement) this.children;
    }

    @JsOverlay
    public final Object key() {
        return this.key;
    }
}
