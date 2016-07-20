package react.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@SuppressWarnings("all")
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class HTMLProps extends DOMProps {
    @JsProperty
    public boolean defaultChecked;
    @JsProperty
    public Object defaultValue;
    @JsProperty
    public String accept;
    @JsProperty
    public String acceptCharset;
    @JsProperty
    public String accessKey;
    @JsProperty
    public String action;
    @JsProperty
    public boolean allowFullScreen;
    @JsProperty
    public boolean allowTransparency;
    @JsProperty
    public String alt;
    @JsProperty
    public boolean async;
    @JsProperty
    public String autoComplete;
    @JsProperty
    public boolean autoFocus;
    @JsProperty
    public boolean autoPlay;
    @JsProperty
    public boolean capture;
    @JsProperty
    public Object cellPadding;
    @JsProperty
    public Object cellSpacing;
    @JsProperty
    public String charSet;
    @JsProperty
    public String challenge;
    @JsProperty
    public boolean checked;
    @JsProperty
    public String classID;
    @JsProperty
    public String className;
    @JsProperty
    public Number cols;
    @JsProperty
    public Number colSpan;
    @JsProperty
    public String content;
    @JsProperty
    public boolean contentEditable;
    @JsProperty
    public String contextMenu;
    @JsProperty
    public boolean controls;
    @JsProperty
    public String coords;
    @JsProperty
    public String crossOrigin;
    @JsProperty
    public String data;
    @JsProperty
    public String dateTime;
    @JsProperty(name = "default")
    public boolean _default;
    @JsProperty
    public boolean defer;
    @JsProperty
    public String dir;
    @JsProperty
    public boolean disabled;
    @JsProperty
    public Object download;
    @JsProperty
    public boolean draggable;
    @JsProperty
    public String encType;
    @JsProperty
    public String form;
    @JsProperty
    public String formAction;
    @JsProperty
    public String formEncType;
    @JsProperty
    public String formMethod;
    @JsProperty
    public boolean formNoValidate;
    @JsProperty
    public String formTarget;
    @JsProperty
    public Object frameBorder;
    @JsProperty
    public String headers;
    @JsProperty
    public Object height;
    @JsProperty
    public boolean hidden;
    @JsProperty
    public Number high;
    @JsProperty
    public String href;
    @JsProperty
    public String hrefLang;
    @JsProperty
    public String htmlFor;
    @JsProperty
    public String httpEquiv;
    @JsProperty
    public String icon;
    @JsProperty
    public String id;
    @JsProperty
    public String inputMode;
    @JsProperty
    public String integrity;
    @JsProperty
    public String is;
    @JsProperty
    public String keyParams;
    @JsProperty
    public String keyType;
    @JsProperty
    public String kind;
    @JsProperty
    public String label;
    @JsProperty
    public String lang;
    @JsProperty
    public String list;
    @JsProperty
    public boolean loop;
    @JsProperty
    public Number low;
    @JsProperty
    public String manifest;
    @JsProperty
    public Number marginHeight;
    @JsProperty
    public Number marginWidth;
    @JsProperty
    public Object max;
    @JsProperty
    public Number maxLength;
    @JsProperty
    public String media;
    @JsProperty
    public String mediaGroup;
    @JsProperty
    public String method;
    @JsProperty
    public Object min;
    @JsProperty
    public Number minLength;
    @JsProperty
    public boolean multiple;
    @JsProperty
    public boolean muted;
    @JsProperty
    public String name;
    @JsProperty
    public boolean noValidate;
    @JsProperty
    public boolean open;
    @JsProperty
    public Number optimum;
    @JsProperty
    public String pattern;
    @JsProperty
    public String placeholder;
    @JsProperty
    public String poster;
    @JsProperty
    public String preload;
    @JsProperty
    public String radioGroup;
    @JsProperty
    public boolean readOnly;
    @JsProperty
    public String rel;
    @JsProperty
    public boolean required;
    @JsProperty
    public String role;
    @JsProperty
    public Number rows;
    @JsProperty
    public Number rowSpan;
    @JsProperty
    public String sandbox;
    @JsProperty
    public String scope;
    @JsProperty
    public boolean scoped;
    @JsProperty
    public String scrolling;
    @JsProperty
    public boolean seamless;
    @JsProperty
    public boolean selected;
    @JsProperty
    public String shape;
    @JsProperty
    public Number size;
    @JsProperty
    public String sizes;
    @JsProperty
    public Number span;
    @JsProperty
    public boolean spellCheck;
    @JsProperty
    public String src;
    @JsProperty
    public String srcDoc;
    @JsProperty
    public String srcLang;
    @JsProperty
    public String srcSet;
    @JsProperty
    public Number start;
    @JsProperty
    public Object step;
    @JsProperty
    public StyleProps style;
    @JsProperty
    public String summary;
    @JsProperty
    public Number tabIndex;
    @JsProperty
    public String target;
    @JsProperty
    public String title;
    @JsProperty
    public String type;
    @JsProperty
    public String useMap;
    @JsProperty
    public Object value;
    @JsProperty
    public Object width;
    @JsProperty
    public String wmode;
    @JsProperty
    public String wrap;
    @JsProperty
    public String about;
    @JsProperty
    public String datatype;
    @JsProperty
    public Object inlist;
    @JsProperty
    public String prefix;
    @JsProperty
    public String property;
    @JsProperty
    public String resource;
    @JsProperty
    public String typeof;
    @JsProperty
    public String vocab;
    @JsProperty
    public boolean autoCapitalize;
    @JsProperty
    public String autoCorrect;
    @JsProperty
    public String autoSave;
    @JsProperty
    public String color;
    @JsProperty
    public String itemProp;
    @JsProperty
    public boolean itemScope;
    @JsProperty
    public String itemType;
    @JsProperty
    public String itemID;
    @JsProperty
    public String itemRef;
    @JsProperty
    public Number results;
    @JsProperty
    public String security;
    @JsProperty
    public boolean unselectable;
    
    @JsOverlay
    public final HTMLProps children(Object children) {
        this.children = children;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps key(Object key) {
        this.key = key;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps ref(String ref) {
        this.ref = ref;
        return this;
    }

    
    @JsOverlay
    public final <T> HTMLProps ref(Func.Run1<T> ref) {
        this.ref = ref;
        return this;
    }

    
    @JsOverlay
    public final <T> HTMLProps ref(final Ref<T> ref) {
        if (ref == null) {
            return this;
        }
        this.ref = ref.getName();
        return this;
    }

    @JsOverlay
    public final HTMLProps set(String name, String value) {
        if (value != null) {
            Jso.set(this, name, value);
        }
        return this;
    }

    @JsOverlay
    public final HTMLProps defaultChecked(boolean value) {
        this.defaultChecked = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps defaultValue(Object value) {
        this.defaultValue = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps accept(String value) {
        this.accept = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps acceptCharset(String value) {
        this.acceptCharset = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps accessKey(String value) {
        this.accessKey = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps action(String value) {
        this.action = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps allowFullScreen(boolean value) {
        this.allowFullScreen = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps allowTransparency(boolean value) {
        this.allowTransparency = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps alt(String value) {
        this.alt = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps async(boolean value) {
        this.async = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps autoComplete(String value) {
        this.autoComplete = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps autoFocus(boolean value) {
        this.autoFocus = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps autoPlay(boolean value) {
        this.autoPlay = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps capture(boolean value) {
        this.capture = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps cellPadding(Object value) {
        this.cellPadding = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps cellSpacing(Object value) {
        this.cellSpacing = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps charSet(String value) {
        this.charSet = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps challenge(String value) {
        this.challenge = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps checked(boolean value) {
        this.checked = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps classID(String value) {
        this.classID = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps className(String value) {
        this.className = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps cols(Number value) {
        this.cols = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps colSpan(Number value) {
        this.colSpan = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps content(String value) {
        this.content = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps contentEditable(boolean value) {
        this.contentEditable = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps contextMenu(String value) {
        this.contextMenu = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps controls(boolean value) {
        this.controls = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps coords(String value) {
        this.coords = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps crossOrigin(String value) {
        this.crossOrigin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps data(String value) {
        this.data = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps dateTime(String value) {
        this.dateTime = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps _default(boolean value) {
        this._default = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps defer(boolean value) {
        this.defer = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps dir(String value) {
        this.dir = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps disabled(boolean value) {
        this.disabled = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps download(Object value) {
        this.download = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps draggable(boolean value) {
        this.draggable = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps encType(String value) {
        this.encType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps form(String value) {
        this.form = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps formAction(String value) {
        this.formAction = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps formEncType(String value) {
        this.formEncType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps formMethod(String value) {
        this.formMethod = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps formNoValidate(boolean value) {
        this.formNoValidate = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps formTarget(String value) {
        this.formTarget = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps frameBorder(Object value) {
        this.frameBorder = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps headers(String value) {
        this.headers = value;
        return this;
    }

//    @JsOverlay
//    public final HTMLProps height(Object value) {
//        this.height = value;
//        style().height(value);
//        return this;
//    }

    @JsOverlay
    public final HTMLProps hidden(boolean value) {
        this.hidden = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps high(Number value) {
        this.high = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps href(String value) {
        this.href = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps hrefLang(String value) {
        this.hrefLang = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps htmlFor(String value) {
        this.htmlFor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps httpEquiv(String value) {
        this.httpEquiv = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps icon(String value) {
        this.icon = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps id(String value) {
        this.id = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps inputMode(String value) {
        this.inputMode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps integrity(String value) {
        this.integrity = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps is(String value) {
        this.is = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps keyParams(String value) {
        this.keyParams = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps keyType(String value) {
        this.keyType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps kind(String value) {
        this.kind = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps label(String value) {
        this.label = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps lang(String value) {
        this.lang = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps list(String value) {
        this.list = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps loop(boolean value) {
        this.loop = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps low(Number value) {
        this.low = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps manifest(String value) {
        this.manifest = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marginHeight(Number value) {
        this.marginHeight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marginWidth(Number value) {
        this.marginWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps max(Object value) {
        this.max = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maxLength(Number value) {
        this.maxLength = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps media(String value) {
        this.media = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps mediaGroup(String value) {
        this.mediaGroup = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps method(String value) {
        this.method = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps min(Object value) {
        this.min = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps minLength(Number value) {
        this.minLength = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps multiple(boolean value) {
        this.multiple = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps muted(boolean value) {
        this.muted = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps name(String value) {
        this.name = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps noValidate(boolean value) {
        this.noValidate = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps open(boolean value) {
        this.open = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps optimum(Number value) {
        this.optimum = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pattern(String value) {
        this.pattern = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps placeholder(String value) {
        this.placeholder = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps poster(String value) {
        this.poster = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps preload(String value) {
        this.preload = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps radioGroup(String value) {
        this.radioGroup = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps readOnly(boolean value) {
        this.readOnly = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps rel(String value) {
        this.rel = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps required(boolean value) {
        this.required = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps role(String value) {
        this.role = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps rows(Number value) {
        this.rows = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps rowSpan(Number value) {
        this.rowSpan = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps sandbox(String value) {
        this.sandbox = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps scope(String value) {
        this.scope = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps scoped(boolean value) {
        this.scoped = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps scrolling(String value) {
        this.scrolling = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps seamless(boolean value) {
        this.seamless = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps selected(boolean value) {
        this.selected = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps shape(String value) {
        this.shape = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps size(Number value) {
        this.size = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps sizes(String value) {
        this.sizes = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps span(Number value) {
        this.span = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps spellCheck(boolean value) {
        this.spellCheck = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps src(String value) {
        this.src = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps srcDoc(String value) {
        this.srcDoc = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps srcLang(String value) {
        this.srcLang = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps srcSet(String value) {
        this.srcSet = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps start(Number value) {
        this.start = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps step(Object value) {
        this.step = value;
        return this;
    }

    @JsOverlay
    public final StyleProps style() {
        if (style == null)
            style = new StyleProps();
        return style;
    }

    @JsOverlay
    public final HTMLProps style(StyleProps value) {
        this.style = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps style(Func.Run1<StyleProps> callback) {
        if (callback == null) {
            return this;
        }
        this.style = new StyleProps();
        callback.run(this.style);
        return this;
    }

    @JsOverlay
    public final HTMLProps summary(String value) {
        this.summary = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps tabIndex(Number value) {
        this.tabIndex = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps target(String value) {
        this.target = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps title(String value) {
        this.title = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps type(String value) {
        this.type = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps useMap(String value) {
        this.useMap = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps value(Object value) {
        this.value = value;
        return this;
    }

//    @JsOverlay
//    public final HTMLProps width(Object value) {
//        this.width = value;
//        return this;
//    }

    @JsOverlay
    public final HTMLProps wmode(String value) {
        this.wmode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps wrap(String value) {
        this.wrap = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps about(String value) {
        this.about = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps datatype(String value) {
        this.datatype = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps inlist(Object value) {
        this.inlist = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps prefix(String value) {
        this.prefix = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps property(String value) {
        this.property = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps resource(String value) {
        this.resource = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps typeof(String value) {
        this.typeof = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps vocab(String value) {
        this.vocab = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps autoCapitalize(boolean value) {
        this.autoCapitalize = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps autoCorrect(String value) {
        this.autoCorrect = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps autoSave(String value) {
        this.autoSave = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps color(String value) {
        this.color = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps itemProp(String value) {
        this.itemProp = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps itemScope(boolean value) {
        this.itemScope = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps itemType(String value) {
        this.itemType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps itemID(String value) {
        this.itemID = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps itemRef(String value) {
        this.itemRef = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps results(Number value) {
        this.results = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps security(String value) {
        this.security = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps unselectable(boolean value) {
        this.unselectable = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onCopy(Func.Run1<ClipboardEvent> value) {
        this.onCopy = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onCut(Func.Run1<ClipboardEvent> value) {
        this.onCut = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onPaste(Func.Run1<ClipboardEvent> value) {
        this.onPaste = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onCompositionEnd(Func.Run1<CompositionEvent> value) {
        this.onCompositionEnd = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onCompositionStart(Func.Run1<CompositionEvent> value) {
        this.onCompositionStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onCompositionUpdate(Func.Run1<CompositionEvent> value) {
        this.onCompositionUpdate = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onFocus(Func.Run1<FocusEvent> value) {
        this.onFocus = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onBlur(Func.Run1<FocusEvent> value) {
        this.onBlur = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onChange(Func.Run1<FormEvent> value) {
        this.onChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onInput(Func.Run1<FormEvent> value) {
        this.onInput = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onSubmit(Func.Run1<FormEvent> value) {
        this.onSubmit = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onLoad(Func.Run1<SyntheticEvent> value) {
        this.onLoad = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onError(Func.Run1<SyntheticEvent> value) {
        this.onError = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onKeyDown(Func.Run1<KeyboardEvent> value) {
        this.onKeyDown = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onKeyPress(Func.Run1<KeyboardEvent> value) {
        this.onKeyPress = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onKeyUp(Func.Run1<KeyboardEvent> value) {
        this.onKeyUp = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onAbort(Func.Run1<SyntheticEvent> value) {
        this.onAbort = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onCanPlay(Func.Run1<SyntheticEvent> value) {
        this.onCanPlay = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onCanPlayThrough(Func.Run1<SyntheticEvent> value) {
        this.onCanPlayThrough = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDurationChange(Func.Run1<SyntheticEvent> value) {
        this.onDurationChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onEmptied(Func.Run1<SyntheticEvent> value) {
        this.onEmptied = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onEncrypted(Func.Run1<SyntheticEvent> value) {
        this.onEncrypted = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onEnded(Func.Run1<SyntheticEvent> value) {
        this.onEnded = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onLoadedData(Func.Run1<SyntheticEvent> value) {
        this.onLoadedData = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onLoadedMetadata(Func.Run1<SyntheticEvent> value) {
        this.onLoadedMetadata = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onLoadStart(Func.Run1<SyntheticEvent> value) {
        this.onLoadStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onPause(Func.Run1<SyntheticEvent> value) {
        this.onPause = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onPlay(Func.Run1<SyntheticEvent> value) {
        this.onPlay = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onPlaying(Func.Run1<SyntheticEvent> value) {
        this.onPlaying = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onProgress(Func.Run1<SyntheticEvent> value) {
        this.onProgress = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onRateChange(Func.Run1<SyntheticEvent> value) {
        this.onRateChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onSeeked(Func.Run1<SyntheticEvent> value) {
        this.onSeeked = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onSeeking(Func.Run1<SyntheticEvent> value) {
        this.onSeeking = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onStalled(Func.Run1<SyntheticEvent> value) {
        this.onStalled = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onSuspend(Func.Run1<SyntheticEvent> value) {
        this.onSuspend = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onTimeUpdate(Func.Run1<SyntheticEvent> value) {
        this.onTimeUpdate = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onVolumeChange(Func.Run1<SyntheticEvent> value) {
        this.onVolumeChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onWaiting(Func.Run1<SyntheticEvent> value) {
        this.onWaiting = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onClick(Func.Run1<MouseEvent> value) {
        this.onClick = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onContextMenu(Func.Run1<MouseEvent> value) {
        this.onContextMenu = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDoubleClick(Func.Run1<MouseEvent> value) {
        this.onDoubleClick = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDrag(Func.Run1<DragEvent> value) {
        this.onDrag = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDragEnd(Func.Run1<DragEvent> value) {
        this.onDragEnd = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDragEnter(Func.Run1<DragEvent> value) {
        this.onDragEnter = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDragExit(Func.Run1<DragEvent> value) {
        this.onDragExit = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDragLeave(Func.Run1<DragEvent> value) {
        this.onDragLeave = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDragOver(Func.Run1<DragEvent> value) {
        this.onDragOver = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDragStart(Func.Run1<DragEvent> value) {
        this.onDragStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onDrop(Func.Run1<DragEvent> value) {
        this.onDrop = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onMouseDown(Func.Run1<MouseEvent> value) {
        this.onMouseDown = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onMouseEnter(Func.Run1<MouseEvent> value) {
        this.onMouseEnter = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onMouseLeave(Func.Run1<MouseEvent> value) {
        this.onMouseLeave = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onMouseMove(Func.Run1<MouseEvent> value) {
        this.onMouseMove = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onMouseOut(Func.Run1<MouseEvent> value) {
        this.onMouseOut = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onMouseOver(Func.Run1<MouseEvent> value) {
        this.onMouseOver = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onMouseUp(Func.Run1<MouseEvent> value) {
        this.onMouseUp = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onSelect(Func.Run1<SyntheticEvent> value) {
        this.onSelect = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onTouchCancel(Func.Run1<TouchEvent> value) {
        this.onTouchCancel = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onTouchEnd(Func.Run1<TouchEvent> value) {
        this.onTouchEnd = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onTouchMove(Func.Run1<TouchEvent> value) {
        this.onTouchMove = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onTouchStart(Func.Run1<TouchEvent> value) {
        this.onTouchStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onScroll(Func.Run1<UIEvent> value) {
        this.onScroll = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps onWheel(Func.Run1<WheelEvent> value) {
        this.onWheel = value;
        return this;
    }





    @JsOverlay
    public final HTMLProps backgroundColor(Object value) {
        style().backgroundColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxFlex(Number value) {
        style().boxFlex = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxFlexGroup(Number value) {
        style().boxFlexGroup = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnCount(Number value) {
        style().columnCount = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flex(Object value) {
        style().flex = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexGrow(Number value) {
        style().flexGrow = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexShrink(Number value) {
        style().flexShrink = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontWeight(Object value) {
        style().fontWeight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps lineClamp(Number value) {
        style().lineClamp = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps lineHeight(Object value) {
        style().lineHeight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps opacity(Number value) {
        style().opacity = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps order(Number value) {
        style().order = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps orphans(Number value) {
        style().orphans = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps widows(Number value) {
        style().widows = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps zIndex(Number value) {
        style().zIndex = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps zoom(Number value) {
        style().zoom = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontSize(Object value) {
        style().fontSize = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fillOpacity(Number value) {
        style().fillOpacity = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps strokeOpacity(Number value) {
        style().strokeOpacity = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps strokeWidth(Number value) {
        style().strokeWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps alignContent(Object value) {
        style().alignContent = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps alignItems(Object value) {
        style().alignItems = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps alignSelf(Object value) {
        style().alignSelf = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps alignmentAdjust(Object value) {
        style().alignmentAdjust = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps alignmentBaseline(Object value) {
        style().alignmentBaseline = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps animationDelay(Object value) {
        style().animationDelay = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps animationDirection(Object value) {
        style().animationDirection = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps animationIterationCount(Object value) {
        style().animationIterationCount = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps animationName(Object value) {
        style().animationName = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps animationPlayState(Object value) {
        style().animationPlayState = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps appearance(Object value) {
        style().appearance = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps backfaceVisibility(Object value) {
        style().backfaceVisibility = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps backgroundBlendMode(Object value) {
        style().backgroundBlendMode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps backgroundComposite(Object value) {
        style().backgroundComposite = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps backgroundImage(Object value) {
        style().backgroundImage = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps backgroundOrigin(Object value) {
        style().backgroundOrigin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps backgroundPositionX(Object value) {
        style().backgroundPositionX = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps backgroundRepeat(Object value) {
        style().backgroundRepeat = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps baselineShift(Object value) {
        style().baselineShift = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps behavior(Object value) {
        style().behavior = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps border(Object value) {
        style().border = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderBottomLeftRadius(Object value) {
        style().borderBottomLeftRadius = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderBottomRightRadius(Object value) {
        style().borderBottomRightRadius = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderBottomWidth(Object value) {
        style().borderBottomWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderCollapse(Object value) {
        style().borderCollapse = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderColor(Object value) {
        style().borderColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderCornerShape(Object value) {
        style().borderCornerShape = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderImageSource(Object value) {
        style().borderImageSource = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderImageWidth(Object value) {
        style().borderImageWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderLeft(Object value) {
        style().borderLeft = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderLeftColor(Object value) {
        style().borderLeftColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderLeftStyle(Object value) {
        style().borderLeftStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderLeftWidth(Object value) {
        style().borderLeftWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderRight(Object value) {
        style().borderRight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderRightColor(Object value) {
        style().borderRightColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderRightStyle(Object value) {
        style().borderRightStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderRightWidth(Object value) {
        style().borderRightWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderSpacing(Object value) {
        style().borderSpacing = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderStyle(Object value) {
        style().borderStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderTop(Object value) {
        style().borderTop = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderTopColor(Object value) {
        style().borderTopColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderTopLeftRadius(Object value) {
        style().borderTopLeftRadius = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderTopRightRadius(Object value) {
        style().borderTopRightRadius = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderTopStyle(Object value) {
        style().borderTopStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderTopWidth(Object value) {
        style().borderTopWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps borderWidth(Object value) {
        style().borderWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxAlign(Object value) {
        style().boxAlign = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxDecorationBreak(Object value) {
        style().boxDecorationBreak = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxDirection(Object value) {
        style().boxDirection = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxLineProgression(Object value) {
        style().boxLineProgression = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxLines(Object value) {
        style().boxLines = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps boxOrdinalGroup(Object value) {
        style().boxOrdinalGroup = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps breakAfter(Object value) {
        style().breakAfter = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps breakBefore(Object value) {
        style().breakBefore = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps breakInside(Object value) {
        style().breakInside = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps clear(Object value) {
        style().clear = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps clip(Object value) {
        style().clip = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps clipRule(Object value) {
        style().clipRule = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps color(Object value) {
        style().color = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnFill(Object value) {
        style().columnFill = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnGap(Object value) {
        style().columnGap = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnRule(Object value) {
        style().columnRule = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnRuleColor(Object value) {
        style().columnRuleColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnRuleWidth(Object value) {
        style().columnRuleWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnSpan(Object value) {
        style().columnSpan = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columnWidth(Object value) {
        style().columnWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps columns(Object value) {
        style().columns = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps counterIncrement(Object value) {
        style().counterIncrement = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps counterReset(Object value) {
        style().counterReset = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps cue(Object value) {
        style().cue = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps cueAfter(Object value) {
        style().cueAfter = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps direction(Object value) {
        style().direction = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps display(Object value) {
        style().display = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fill(Object value) {
        style().fill = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fillRule(Object value) {
        style().fillRule = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps filter(Object value) {
        style().filter = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexAlign(Object value) {
        style().flexAlign = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexBasis(Object value) {
        style().flexBasis = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexDirection(Object value) {
        style().flexDirection = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexFlow(Object value) {
        style().flexFlow = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexItemAlign(Object value) {
        style().flexItemAlign = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexLinePack(Object value) {
        style().flexLinePack = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flexOrder(Object value) {
        style().flexOrder = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps _float(Object value) {
        style()._float = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps flowFrom(Object value) {
        style().flowFrom = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps font(Object value) {
        style().font = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontFamily(Object value) {
        style().fontFamily = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontKerning(Object value) {
        style().fontKerning = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontSizeAdjust(Object value) {
        style().fontSizeAdjust = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontStretch(Object value) {
        style().fontStretch = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontStyle(Object value) {
        style().fontStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontSynthesis(Object value) {
        style().fontSynthesis = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontVariant(Object value) {
        style().fontVariant = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps fontVariantAlternates(Object value) {
        style().fontVariantAlternates = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridArea(Object value) {
        style().gridArea = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridColumn(Object value) {
        style().gridColumn = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridColumnEnd(Object value) {
        style().gridColumnEnd = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridColumnStart(Object value) {
        style().gridColumnStart = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridRow(Object value) {
        style().gridRow = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridRowEnd(Object value) {
        style().gridRowEnd = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridRowPosition(Object value) {
        style().gridRowPosition = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridRowSpan(Object value) {
        style().gridRowSpan = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridTemplateAreas(Object value) {
        style().gridTemplateAreas = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridTemplateColumns(Object value) {
        style().gridTemplateColumns = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps gridTemplateRows(Object value) {
        style().gridTemplateRows = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps hyphenateLimitChars(Object value) {
        style().hyphenateLimitChars = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps hyphenateLimitLines(Object value) {
        style().hyphenateLimitLines = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps hyphenateLimitZone(Object value) {
        style().hyphenateLimitZone = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps hyphens(Object value) {
        style().hyphens = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps imeMode(Object value) {
        style().imeMode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps layoutGrid(Object value) {
        style().layoutGrid = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps layoutGridChar(Object value) {
        style().layoutGridChar = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps layoutGridLine(Object value) {
        style().layoutGridLine = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps layoutGridMode(Object value) {
        style().layoutGridMode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps layoutGridType(Object value) {
        style().layoutGridType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps left(Object value) {
        style().left = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps letterSpacing(Object value) {
        style().letterSpacing = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps lineBreak(Object value) {
        style().lineBreak = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps listStyle(Object value) {
        style().listStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps listStyleImage(Object value) {
        style().listStyleImage = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps listStylePosition(Object value) {
        style().listStylePosition = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps listStyleType(Object value) {
        style().listStyleType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps margin(Object value) {
        style().margin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marginBottom(Object value) {
        style().marginBottom = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marginLeft(Object value) {
        style().marginLeft = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marginRight(Object value) {
        style().marginRight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marginTop(Object value) {
        style().marginTop = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marqueeDirection(Object value) {
        style().marqueeDirection = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps marqueeStyle(Object value) {
        style().marqueeStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps mask(Object value) {
        style().mask = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maskBorder(Object value) {
        style().maskBorder = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maskBorderRepeat(Object value) {
        style().maskBorderRepeat = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maskBorderSlice(Object value) {
        style().maskBorderSlice = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maskBorderSource(Object value) {
        style().maskBorderSource = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maskBorderWidth(Object value) {
        style().maskBorderWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maskClip(Object value) {
        style().maskClip = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maskOrigin(Object value) {
        style().maskOrigin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maxFontSize(Object value) {
        style().maxFontSize = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maxHeight(Object value) {
        style().maxHeight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps maxWidth(Object value) {
        style().maxWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps minWidth(Object value) {
        style().minWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps outline(Object value) {
        style().outline = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps outlineColor(Object value) {
        style().outlineColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps outlineOffset(Object value) {
        style().outlineOffset = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps overflow(Object value) {
        style().overflow = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps overflowStyle(Object value) {
        style().overflowStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps overflowX(Object value) {
        style().overflowX = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps padding(Object value) {
        style().padding = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps paddingBottom(Object value) {
        style().paddingBottom = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps paddingLeft(Object value) {
        style().paddingLeft = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps paddingRight(Object value) {
        style().paddingRight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps paddingTop(Object value) {
        style().paddingTop = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pageBreakAfter(Object value) {
        style().pageBreakAfter = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pageBreakBefore(Object value) {
        style().pageBreakBefore = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pageBreakInside(Object value) {
        style().pageBreakInside = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pause(Object value) {
        style().pause = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pauseAfter(Object value) {
        style().pauseAfter = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pauseBefore(Object value) {
        style().pauseBefore = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps perspective(Object value) {
        style().perspective = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps perspectiveOrigin(Object value) {
        style().perspectiveOrigin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps pointerEvents(Object value) {
        style().pointerEvents = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps position(Object value) {
        style().position = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps punctuationTrim(Object value) {
        style().punctuationTrim = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps quotes(Object value) {
        style().quotes = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps regionFragment(Object value) {
        style().regionFragment = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps restAfter(Object value) {
        style().restAfter = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps restBefore(Object value) {
        style().restBefore = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps right(Object value) {
        style().right = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps rubyAlign(Object value) {
        style().rubyAlign = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps rubyPosition(Object value) {
        style().rubyPosition = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps shapeImageThreshold(Object value) {
        style().shapeImageThreshold = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps shapeInside(Object value) {
        style().shapeInside = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps shapeMargin(Object value) {
        style().shapeMargin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps shapeOutside(Object value) {
        style().shapeOutside = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps speak(Object value) {
        style().speak = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps speakAs(Object value) {
        style().speakAs = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps tabSize(Object value) {
        style().tabSize = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps tableLayout(Object value) {
        style().tableLayout = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textAlign(Object value) {
        style().textAlign = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textAlignLast(Object value) {
        style().textAlignLast = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecoration(Object value) {
        style().textDecoration = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationColor(Object value) {
        style().textDecorationColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationLine(Object value) {
        style().textDecorationLine = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationLineThrough(Object value) {
        style().textDecorationLineThrough = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationNone(Object value) {
        style().textDecorationNone = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationOverline(Object value) {
        style().textDecorationOverline = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationSkip(Object value) {
        style().textDecorationSkip = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationStyle(Object value) {
        style().textDecorationStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textDecorationUnderline(Object value) {
        style().textDecorationUnderline = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textEmphasis(Object value) {
        style().textEmphasis = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textEmphasisColor(Object value) {
        style().textEmphasisColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textEmphasisStyle(Object value) {
        style().textEmphasisStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textHeight(Object value) {
        style().textHeight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textIndent(Object value) {
        style().textIndent = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textJustifyTrim(Object value) {
        style().textJustifyTrim = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textKashidaSpace(Object value) {
        style().textKashidaSpace = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textLineThrough(Object value) {
        style().textLineThrough = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textLineThroughColor(Object value) {
        style().textLineThroughColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textLineThroughMode(Object value) {
        style().textLineThroughMode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textLineThroughStyle(Object value) {
        style().textLineThroughStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textLineThroughWidth(Object value) {
        style().textLineThroughWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textOverflow(Object value) {
        style().textOverflow = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textOverline(Object value) {
        style().textOverline = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textOverlineColor(Object value) {
        style().textOverlineColor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textOverlineMode(Object value) {
        style().textOverlineMode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textOverlineStyle(Object value) {
        style().textOverlineStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textOverlineWidth(Object value) {
        style().textOverlineWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textRendering(Object value) {
        style().textRendering = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textScript(Object value) {
        style().textScript = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textShadow(Object value) {
        style().textShadow = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textTransform(Object value) {
        style().textTransform = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textUnderlinePosition(Object value) {
        style().textUnderlinePosition = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps textUnderlineStyle(Object value) {
        style().textUnderlineStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps top(Object value) {
        style().top = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps touchAction(Object value) {
        style().touchAction = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transform(Object value) {
        style().transform = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transformOrigin(Object value) {
        style().transformOrigin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transformOriginZ(Object value) {
        style().transformOriginZ = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transformStyle(Object value) {
        style().transformStyle = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transition(Object value) {
        style().transition = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transitionDelay(Object value) {
        style().transitionDelay = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transitionDuration(Object value) {
        style().transitionDuration = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transitionProperty(Object value) {
        style().transitionProperty = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps transitionTimingFunction(Object value) {
        style().transitionTimingFunction = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps unicodeBidi(Object value) {
        style().unicodeBidi = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps unicodeRange(Object value) {
        style().unicodeRange = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps userFocus(Object value) {
        style().userFocus = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps userInput(Object value) {
        style().userInput = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps verticalAlign(Object value) {
        style().verticalAlign = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps visibility(Object value) {
        style().visibility = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voiceBalance(Object value) {
        style().voiceBalance = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voiceDuration(Object value) {
        style().voiceDuration = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voiceFamily(Object value) {
        style().voiceFamily = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voicePitch(Object value) {
        style().voicePitch = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voiceRange(Object value) {
        style().voiceRange = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voiceRate(Object value) {
        style().voiceRate = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voiceStress(Object value) {
        style().voiceStress = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps voiceVolume(Object value) {
        style().voiceVolume = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps whiteSpace(Object value) {
        style().whiteSpace = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps whiteSpaceTreatment(Object value) {
        style().whiteSpaceTreatment = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps width(Object value) {
        style().width = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps wordBreak(Object value) {
        style().wordBreak = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps wordSpacing(Object value) {
        style().wordSpacing = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps wordWrap(Object value) {
        style().wordWrap = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps wrapFlow(Object value) {
        style().wrapFlow = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps wrapMargin(Object value) {
        style().wrapMargin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps wrapOption(Object value) {
        style().wrapOption = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps writingMode(Object value) {
        style().writingMode = value;
        return this;
    }
}
