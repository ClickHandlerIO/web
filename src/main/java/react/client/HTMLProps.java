package react.client;

import common.client.Func;
import common.client.Jso;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType
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

    @Override
    @JsIgnore
    public HTMLProps<T> children(Object children) {
        super.children(children);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> key(Object key) {
        super.key(key);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> ref(String ref) {
        super.ref(ref);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> ref(Func.Run1<T> ref) {
        super.ref(ref);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> ref(final Ref<T> ref) {
        if (ref == null) {
            return this;
        }
        this.ref = ref.getName();
        return this;
    }

    @JsIgnore
    public HTMLProps<T> set(String name, String value) {
        if (value != null) {
            Jso.set(this, name, value);
        }
        return this;
    }

    @JsIgnore
    public HTMLProps<T> defaultChecked(boolean value) {
        this.defaultChecked = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> defaultValue(Object value) {
        this.defaultValue = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> accept(String value) {
        this.accept = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> acceptCharset(String value) {
        this.acceptCharset = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> accessKey(String value) {
        this.accessKey = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> action(String value) {
        this.action = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> allowFullScreen(boolean value) {
        this.allowFullScreen = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> allowTransparency(boolean value) {
        this.allowTransparency = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> alt(String value) {
        this.alt = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> async(boolean value) {
        this.async = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> autoComplete(String value) {
        this.autoComplete = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> autoFocus(boolean value) {
        this.autoFocus = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> autoPlay(boolean value) {
        this.autoPlay = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> capture(boolean value) {
        this.capture = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> cellPadding(Object value) {
        this.cellPadding = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> cellSpacing(Object value) {
        this.cellSpacing = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> charSet(String value) {
        this.charSet = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> challenge(String value) {
        this.challenge = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> checked(boolean value) {
        this.checked = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> classID(String value) {
        this.classID = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> className(String value) {
        this.className = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> cols(Number value) {
        this.cols = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> colSpan(Number value) {
        this.colSpan = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> content(String value) {
        this.content = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> contentEditable(boolean value) {
        this.contentEditable = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> contextMenu(String value) {
        this.contextMenu = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> controls(boolean value) {
        this.controls = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> coords(String value) {
        this.coords = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> crossOrigin(String value) {
        this.crossOrigin = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> data(String value) {
        this.data = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> dateTime(String value) {
        this.dateTime = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> _default(boolean value) {
        this._default = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> defer(boolean value) {
        this.defer = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> dir(String value) {
        this.dir = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> disabled(boolean value) {
        this.disabled = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> download(Object value) {
        this.download = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> draggable(boolean value) {
        this.draggable = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> encType(String value) {
        this.encType = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> form(String value) {
        this.form = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> formAction(String value) {
        this.formAction = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> formEncType(String value) {
        this.formEncType = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> formMethod(String value) {
        this.formMethod = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> formNoValidate(boolean value) {
        this.formNoValidate = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> formTarget(String value) {
        this.formTarget = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> frameBorder(Object value) {
        this.frameBorder = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> headers(String value) {
        this.headers = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> height(Object value) {
        this.height = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> hidden(boolean value) {
        this.hidden = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> high(Number value) {
        this.high = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> href(String value) {
        this.href = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> hrefLang(String value) {
        this.hrefLang = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> htmlFor(String value) {
        this.htmlFor = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> httpEquiv(String value) {
        this.httpEquiv = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> icon(String value) {
        this.icon = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> id(String value) {
        this.id = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> inputMode(String value) {
        this.inputMode = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> integrity(String value) {
        this.integrity = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> is(String value) {
        this.is = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> keyParams(String value) {
        this.keyParams = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> keyType(String value) {
        this.keyType = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> kind(String value) {
        this.kind = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> label(String value) {
        this.label = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> lang(String value) {
        this.lang = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> list(String value) {
        this.list = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> loop(boolean value) {
        this.loop = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> low(Number value) {
        this.low = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> manifest(String value) {
        this.manifest = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> marginHeight(Number value) {
        this.marginHeight = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> marginWidth(Number value) {
        this.marginWidth = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> max(Object value) {
        this.max = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> maxLength(Number value) {
        this.maxLength = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> media(String value) {
        this.media = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> mediaGroup(String value) {
        this.mediaGroup = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> method(String value) {
        this.method = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> min(Object value) {
        this.min = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> minLength(Number value) {
        this.minLength = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> multiple(boolean value) {
        this.multiple = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> muted(boolean value) {
        this.muted = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> name(String value) {
        this.name = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> noValidate(boolean value) {
        this.noValidate = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> open(boolean value) {
        this.open = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> optimum(Number value) {
        this.optimum = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> pattern(String value) {
        this.pattern = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> placeholder(String value) {
        this.placeholder = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> poster(String value) {
        this.poster = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> preload(String value) {
        this.preload = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> radioGroup(String value) {
        this.radioGroup = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> readOnly(boolean value) {
        this.readOnly = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> rel(String value) {
        this.rel = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> required(boolean value) {
        this.required = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> role(String value) {
        this.role = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> rows(Number value) {
        this.rows = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> rowSpan(Number value) {
        this.rowSpan = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> sandbox(String value) {
        this.sandbox = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> scope(String value) {
        this.scope = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> scoped(boolean value) {
        this.scoped = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> scrolling(String value) {
        this.scrolling = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> seamless(boolean value) {
        this.seamless = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> selected(boolean value) {
        this.selected = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> shape(String value) {
        this.shape = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> size(Number value) {
        this.size = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> sizes(String value) {
        this.sizes = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> span(Number value) {
        this.span = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> spellCheck(boolean value) {
        this.spellCheck = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> src(String value) {
        this.src = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> srcDoc(String value) {
        this.srcDoc = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> srcLang(String value) {
        this.srcLang = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> srcSet(String value) {
        this.srcSet = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> start(Number value) {
        this.start = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> step(Object value) {
        this.step = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> style(StyleProps value) {
        this.style = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> style(Func.Run1<StyleProps> callback) {
        if (callback == null) {
            return this;
        }
        this.style = new StyleProps();
        callback.run(this.style);
        return this;
    }

    @JsIgnore
    public HTMLProps<T> summary(String value) {
        this.summary = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> tabIndex(Number value) {
        this.tabIndex = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> target(String value) {
        this.target = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> title(String value) {
        this.title = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> type(String value) {
        this.type = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> useMap(String value) {
        this.useMap = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> value(Object value) {
        this.value = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> width(Object value) {
        this.width = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> wmode(String value) {
        this.wmode = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> wrap(String value) {
        this.wrap = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> about(String value) {
        this.about = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> datatype(String value) {
        this.datatype = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> inlist(Object value) {
        this.inlist = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> prefix(String value) {
        this.prefix = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> property(String value) {
        this.property = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> resource(String value) {
        this.resource = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> typeof(String value) {
        this.typeof = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> vocab(String value) {
        this.vocab = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> autoCapitalize(boolean value) {
        this.autoCapitalize = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> autoCorrect(String value) {
        this.autoCorrect = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> autoSave(String value) {
        this.autoSave = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> color(String value) {
        this.color = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> itemProp(String value) {
        this.itemProp = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> itemScope(boolean value) {
        this.itemScope = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> itemType(String value) {
        this.itemType = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> itemID(String value) {
        this.itemID = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> itemRef(String value) {
        this.itemRef = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> results(Number value) {
        this.results = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> security(String value) {
        this.security = value;
        return this;
    }

    @JsIgnore
    public HTMLProps<T> unselectable(boolean value) {
        this.unselectable = value;
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onCopy(ClipboardEventHandler value) {
        super.onCopy(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onCut(ClipboardEventHandler value) {
        super.onCut(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onPaste(ClipboardEventHandler value) {
        super.onPaste(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onCompositionEnd(CompositionEventHandler value) {
        super.onCompositionEnd(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onCompositionStart(CompositionEventHandler value) {
        super.onCompositionStart(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onCompositionUpdate(CompositionEventHandler value) {
        super.onCompositionUpdate(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onFocus(FocusEventHandler value) {
        super.onFocus(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onBlur(FocusEventHandler value) {
        super.onBlur(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onChange(FormEventHandler value) {
        super.onChange(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onInput(FormEventHandler value) {
        super.onInput(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onSubmit(FormEventHandler value) {
        super.onSubmit(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onLoad(ReactEventHandler value) {
        super.onLoad(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onError(ReactEventHandler value) {
        super.onError(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onKeyDown(KeyboardEventHandler value) {
        super.onKeyDown(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onKeyPress(KeyboardEventHandler value) {
        super.onKeyPress(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onKeyUp(KeyboardEventHandler value) {
        super.onKeyUp(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onAbort(ReactEventHandler value) {
        super.onAbort(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onCanPlay(ReactEventHandler value) {
        super.onCanPlay(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onCanPlayThrough(ReactEventHandler value) {
        super.onCanPlayThrough(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDurationChange(ReactEventHandler value) {
        super.onDurationChange(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onEmptied(ReactEventHandler value) {
        super.onEmptied(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onEncrypted(ReactEventHandler value) {
        super.onEncrypted(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onEnded(ReactEventHandler value) {
        super.onEnded(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onLoadedData(ReactEventHandler value) {
        super.onLoadedData(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onLoadedMetadata(ReactEventHandler value) {
        super.onLoadedMetadata(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onLoadStart(ReactEventHandler value) {
        super.onLoadStart(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onPause(ReactEventHandler value) {
        super.onPause(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onPlay(ReactEventHandler value) {
        super.onPlay(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onPlaying(ReactEventHandler value) {
        super.onPlaying(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onProgress(ReactEventHandler value) {
        super.onProgress(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onRateChange(ReactEventHandler value) {
        super.onRateChange(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onSeeked(ReactEventHandler value) {
        super.onSeeked(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onSeeking(ReactEventHandler value) {
        super.onSeeking(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onStalled(ReactEventHandler value) {
        super.onStalled(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onSuspend(ReactEventHandler value) {
        super.onSuspend(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onTimeUpdate(ReactEventHandler value) {
        super.onTimeUpdate(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onVolumeChange(ReactEventHandler value) {
        super.onVolumeChange(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onWaiting(ReactEventHandler value) {
        super.onWaiting(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onClick(MouseEventHandler value) {
        super.onClick(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onContextMenu(MouseEventHandler value) {
        super.onContextMenu(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDoubleClick(MouseEventHandler value) {
        super.onDoubleClick(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDrag(DragEventHandler value) {
        super.onDrag(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDragEnd(DragEventHandler value) {
        super.onDragEnd(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDragEnter(DragEventHandler value) {
        super.onDragEnter(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDragExit(DragEventHandler value) {
        super.onDragExit(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDragLeave(DragEventHandler value) {
        super.onDragLeave(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDragOver(DragEventHandler value) {
        super.onDragOver(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDragStart(DragEventHandler value) {
        super.onDragStart(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onDrop(DragEventHandler value) {
        super.onDrop(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onMouseDown(MouseEventHandler value) {
        super.onMouseDown(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onMouseEnter(MouseEventHandler value) {
        super.onMouseEnter(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onMouseLeave(MouseEventHandler value) {
        super.onMouseLeave(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onMouseMove(MouseEventHandler value) {
        super.onMouseMove(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onMouseOut(MouseEventHandler value) {
        super.onMouseOut(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onMouseOver(MouseEventHandler value) {
        super.onMouseOver(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onMouseUp(MouseEventHandler value) {
        super.onMouseUp(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onSelect(ReactEventHandler value) {
        super.onSelect(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onTouchCancel(TouchEventHandler value) {
        super.onTouchCancel(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onTouchEnd(TouchEventHandler value) {
        super.onTouchEnd(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onTouchMove(TouchEventHandler value) {
        super.onTouchMove(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onTouchStart(TouchEventHandler value) {
        super.onTouchStart(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onScroll(UIEventHandler value) {
        super.onScroll(value);
        return this;
    }

    @Override
    @JsIgnore
    public HTMLProps<T> onWheel(WheelEventHandler value) {
        super.onWheel(value);
        return this;
    }
}
