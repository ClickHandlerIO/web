package react.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class HTMLProps<T> extends DOMProps<T> {
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
    public final HTMLProps<T> children(Object children) {
        this.children = children;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> key(Object key) {
        this.key = key;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> ref(String ref) {
        this.ref = ref;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> ref(Func.Run1<T> ref) {
        this.ref = ref;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> ref(final Ref<T> ref) {
        if (ref == null) {
            return this;
        }
        this.ref = ref.getName();
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> set(String name, String value) {
        if (value != null) {
            Jso.set(this, name, value);
        }
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> defaultChecked(boolean value) {
        this.defaultChecked = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> defaultValue(Object value) {
        this.defaultValue = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> accept(String value) {
        this.accept = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> acceptCharset(String value) {
        this.acceptCharset = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> accessKey(String value) {
        this.accessKey = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> action(String value) {
        this.action = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> allowFullScreen(boolean value) {
        this.allowFullScreen = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> allowTransparency(boolean value) {
        this.allowTransparency = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> alt(String value) {
        this.alt = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> async(boolean value) {
        this.async = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> autoComplete(String value) {
        this.autoComplete = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> autoFocus(boolean value) {
        this.autoFocus = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> autoPlay(boolean value) {
        this.autoPlay = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> capture(boolean value) {
        this.capture = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> cellPadding(Object value) {
        this.cellPadding = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> cellSpacing(Object value) {
        this.cellSpacing = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> charSet(String value) {
        this.charSet = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> challenge(String value) {
        this.challenge = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> checked(boolean value) {
        this.checked = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> classID(String value) {
        this.classID = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> className(String value) {
        this.className = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> cols(Number value) {
        this.cols = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> colSpan(Number value) {
        this.colSpan = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> content(String value) {
        this.content = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> contentEditable(boolean value) {
        this.contentEditable = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> contextMenu(String value) {
        this.contextMenu = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> controls(boolean value) {
        this.controls = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> coords(String value) {
        this.coords = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> crossOrigin(String value) {
        this.crossOrigin = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> data(String value) {
        this.data = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> dateTime(String value) {
        this.dateTime = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> _default(boolean value) {
        this._default = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> defer(boolean value) {
        this.defer = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> dir(String value) {
        this.dir = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> disabled(boolean value) {
        this.disabled = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> download(Object value) {
        this.download = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> draggable(boolean value) {
        this.draggable = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> encType(String value) {
        this.encType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> form(String value) {
        this.form = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> formAction(String value) {
        this.formAction = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> formEncType(String value) {
        this.formEncType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> formMethod(String value) {
        this.formMethod = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> formNoValidate(boolean value) {
        this.formNoValidate = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> formTarget(String value) {
        this.formTarget = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> frameBorder(Object value) {
        this.frameBorder = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> headers(String value) {
        this.headers = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> height(Object value) {
        this.height = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> hidden(boolean value) {
        this.hidden = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> high(Number value) {
        this.high = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> href(String value) {
        this.href = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> hrefLang(String value) {
        this.hrefLang = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> htmlFor(String value) {
        this.htmlFor = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> httpEquiv(String value) {
        this.httpEquiv = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> icon(String value) {
        this.icon = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> id(String value) {
        this.id = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> inputMode(String value) {
        this.inputMode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> integrity(String value) {
        this.integrity = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> is(String value) {
        this.is = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> keyParams(String value) {
        this.keyParams = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> keyType(String value) {
        this.keyType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> kind(String value) {
        this.kind = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> label(String value) {
        this.label = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> lang(String value) {
        this.lang = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> list(String value) {
        this.list = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> loop(boolean value) {
        this.loop = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> low(Number value) {
        this.low = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> manifest(String value) {
        this.manifest = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> marginHeight(Number value) {
        this.marginHeight = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> marginWidth(Number value) {
        this.marginWidth = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> max(Object value) {
        this.max = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> maxLength(Number value) {
        this.maxLength = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> media(String value) {
        this.media = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> mediaGroup(String value) {
        this.mediaGroup = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> method(String value) {
        this.method = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> min(Object value) {
        this.min = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> minLength(Number value) {
        this.minLength = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> multiple(boolean value) {
        this.multiple = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> muted(boolean value) {
        this.muted = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> name(String value) {
        this.name = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> noValidate(boolean value) {
        this.noValidate = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> open(boolean value) {
        this.open = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> optimum(Number value) {
        this.optimum = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> pattern(String value) {
        this.pattern = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> placeholder(String value) {
        this.placeholder = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> poster(String value) {
        this.poster = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> preload(String value) {
        this.preload = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> radioGroup(String value) {
        this.radioGroup = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> readOnly(boolean value) {
        this.readOnly = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> rel(String value) {
        this.rel = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> required(boolean value) {
        this.required = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> role(String value) {
        this.role = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> rows(Number value) {
        this.rows = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> rowSpan(Number value) {
        this.rowSpan = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> sandbox(String value) {
        this.sandbox = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> scope(String value) {
        this.scope = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> scoped(boolean value) {
        this.scoped = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> scrolling(String value) {
        this.scrolling = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> seamless(boolean value) {
        this.seamless = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> selected(boolean value) {
        this.selected = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> shape(String value) {
        this.shape = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> size(Number value) {
        this.size = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> sizes(String value) {
        this.sizes = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> span(Number value) {
        this.span = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> spellCheck(boolean value) {
        this.spellCheck = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> src(String value) {
        this.src = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> srcDoc(String value) {
        this.srcDoc = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> srcLang(String value) {
        this.srcLang = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> srcSet(String value) {
        this.srcSet = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> start(Number value) {
        this.start = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> step(Object value) {
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
    public final HTMLProps<T> style(StyleProps value) {
        this.style = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> style(Func.Run1<StyleProps> callback) {
        if (callback == null) {
            return this;
        }
        this.style = new StyleProps();
        callback.run(this.style);
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> summary(String value) {
        this.summary = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> tabIndex(Number value) {
        this.tabIndex = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> target(String value) {
        this.target = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> title(String value) {
        this.title = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> type(String value) {
        this.type = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> useMap(String value) {
        this.useMap = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> value(Object value) {
        this.value = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> width(Object value) {
        this.width = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> wmode(String value) {
        this.wmode = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> wrap(String value) {
        this.wrap = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> about(String value) {
        this.about = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> datatype(String value) {
        this.datatype = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> inlist(Object value) {
        this.inlist = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> prefix(String value) {
        this.prefix = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> property(String value) {
        this.property = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> resource(String value) {
        this.resource = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> typeof(String value) {
        this.typeof = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> vocab(String value) {
        this.vocab = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> autoCapitalize(boolean value) {
        this.autoCapitalize = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> autoCorrect(String value) {
        this.autoCorrect = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> autoSave(String value) {
        this.autoSave = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> color(String value) {
        this.color = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> itemProp(String value) {
        this.itemProp = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> itemScope(boolean value) {
        this.itemScope = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> itemType(String value) {
        this.itemType = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> itemID(String value) {
        this.itemID = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> itemRef(String value) {
        this.itemRef = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> results(Number value) {
        this.results = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> security(String value) {
        this.security = value;
        return this;
    }

    @JsOverlay
    public final HTMLProps<T> unselectable(boolean value) {
        this.unselectable = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onCopy(ClipboardEventHandler value) {
        this.onCopy = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onCut(ClipboardEventHandler value) {
        this.onCut = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onPaste(ClipboardEventHandler value) {
        this.onPaste = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onCompositionEnd(CompositionEventHandler value) {
        this.onCompositionEnd = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onCompositionStart(CompositionEventHandler value) {
        this.onCompositionStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onCompositionUpdate(CompositionEventHandler value) {
        this.onCompositionUpdate = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onFocus(FocusEventHandler value) {
        this.onFocus = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onBlur(FocusEventHandler value) {
        this.onBlur = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onChange(FormEventHandler value) {
        this.onChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onInput(FormEventHandler value) {
        this.onInput = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onSubmit(FormEventHandler value) {
        this.onSubmit = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onLoad(ReactEventHandler value) {
        this.onLoad = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onError(ReactEventHandler value) {
        this.onError = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onKeyDown(KeyboardEventHandler value) {
        this.onKeyDown = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onKeyPress(KeyboardEventHandler value) {
        this.onKeyPress = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onKeyUp(KeyboardEventHandler value) {
        this.onKeyUp = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onAbort(ReactEventHandler value) {
        this.onAbort = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onCanPlay(ReactEventHandler value) {
        this.onCanPlay = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onCanPlayThrough(ReactEventHandler value) {
        this.onCanPlayThrough = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDurationChange(ReactEventHandler value) {
        this.onDurationChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onEmptied(ReactEventHandler value) {
        this.onEmptied = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onEncrypted(ReactEventHandler value) {
        this.onEncrypted = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onEnded(ReactEventHandler value) {
        this.onEnded = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onLoadedData(ReactEventHandler value) {
        this.onLoadedData = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onLoadedMetadata(ReactEventHandler value) {
        this.onLoadedMetadata = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onLoadStart(ReactEventHandler value) {
        this.onLoadStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onPause(ReactEventHandler value) {
        this.onPause = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onPlay(ReactEventHandler value) {
        this.onPlay = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onPlaying(ReactEventHandler value) {
        this.onPlaying = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onProgress(ReactEventHandler value) {
        this.onProgress = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onRateChange(ReactEventHandler value) {
        this.onRateChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onSeeked(ReactEventHandler value) {
        this.onSeeked = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onSeeking(ReactEventHandler value) {
        this.onSeeking = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onStalled(ReactEventHandler value) {
        this.onStalled = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onSuspend(ReactEventHandler value) {
        this.onSuspend = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onTimeUpdate(ReactEventHandler value) {
        this.onTimeUpdate = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onVolumeChange(ReactEventHandler value) {
        this.onVolumeChange = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onWaiting(ReactEventHandler value) {
        this.onWaiting = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onClick(MouseEventHandler value) {
        this.onClick = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onContextMenu(MouseEventHandler value) {
        this.onContextMenu = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDoubleClick(MouseEventHandler value) {
        this.onDoubleClick = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDrag(DragEventHandler value) {
        this.onDrag = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDragEnd(DragEventHandler value) {
        this.onDragEnd = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDragEnter(DragEventHandler value) {
        this.onDragEnter = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDragExit(DragEventHandler value) {
        this.onDragExit = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDragLeave(DragEventHandler value) {
        this.onDragLeave = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDragOver(DragEventHandler value) {
        this.onDragOver = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDragStart(DragEventHandler value) {
        this.onDragStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onDrop(DragEventHandler value) {
        this.onDrop = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onMouseDown(MouseEventHandler value) {
        this.onMouseDown = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onMouseEnter(MouseEventHandler value) {
        this.onMouseEnter = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onMouseLeave(MouseEventHandler value) {
        this.onMouseLeave = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onMouseMove(MouseEventHandler value) {
        this.onMouseMove = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onMouseOut(MouseEventHandler value) {
        this.onMouseOut = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onMouseOver(MouseEventHandler value) {
        this.onMouseOver = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onMouseUp(MouseEventHandler value) {
        this.onMouseUp = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onSelect(ReactEventHandler value) {
        this.onSelect = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onTouchCancel(TouchEventHandler value) {
        this.onTouchCancel = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onTouchEnd(TouchEventHandler value) {
        this.onTouchEnd = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onTouchMove(TouchEventHandler value) {
        this.onTouchMove = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onTouchStart(TouchEventHandler value) {
        this.onTouchStart = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onScroll(UIEventHandler value) {
        this.onScroll = value;
        return this;
    }

    
    @JsOverlay
    public final HTMLProps<T> onWheel(WheelEventHandler value) {
        this.onWheel = value;
        return this;
    }
}
