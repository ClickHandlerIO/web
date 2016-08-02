package ui.client;

import common.client.Func;
import elemental.html.InputElement;
import elemental.html.TextAreaElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.textarea;

@Singleton
public class TextArea extends Component<TextArea.Props, TextArea.State> {

    @Inject
    public TextArea() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return textarea(new HTMLProps()
                .id($this.props.id)
                .className("" + $this.props.className)
                .style($this.props.style)
                .cols($this.props.cols)
                .readOnly($this.props.readOnly)
                .disabled($this.props.disabled)
                .zIndex($this.props.zIndex)
                .placeholder($this.props.placeholder)
                .rows($this.props.rows)
                .value($this.props.value)
                .ref($this.props.textAreaRef)
                .onKeyDown(keyboardEvent -> {
                    if ($this.props.onKeyDown != null) {
                        $this.props.onKeyDown.run(keyboardEvent);
                    }
                })
                .onChange(formEvent -> {
                    if ($this.props.onChange != null) {
                        $this.props.onChange.run(((InputElement) formEvent.getTarget()).getValue());
                    }
                })
        );
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class Props extends ComponentProps {
        public Func.Run1<String> onChange;
        public String value;
        public boolean disabled;
        public String className;
        public String placeholder;
        public StyleProps style;
        public String id;
        public int zIndex;
        public int rows;
        public int cols;
        public boolean readOnly;
        public Func.Run1<KeyboardEvent> onKeyDown;
        public Ref<TextAreaElement> textAreaRef;

        @JsOverlay
        public final Props textAreaRef(final Ref<TextAreaElement> textAreaRef) {
            this.textAreaRef = textAreaRef;
            return this;
        }

        @JsOverlay
        public final Props onChange(final Func.Run1<String> onChange) {
            this.onChange = onChange;
            return this;
        }

        @JsOverlay
        public final Props value(final String value) {
            this.value = value;
            return this;
        }

        @JsOverlay
        public final Props disabled(final boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        @JsOverlay
        public final Props className(final String className) {
            this.className = className;
            return this;
        }

        @JsOverlay
        public final Props placeholder(final String placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        @JsOverlay
        public final Props style(final StyleProps style) {
            this.style = style;
            return this;
        }

        @JsOverlay
        public final Props id(final String id) {
            this.id = id;
            return this;
        }

        @JsOverlay
        public final Props zIndex(final int zIndex) {
            this.zIndex = zIndex;
            return this;
        }

        @JsOverlay
        public final Props rows(final int rows) {
            this.rows = rows;
            return this;
        }

        @JsOverlay
        public final Props key(final String key) {
            this.key = key;
            return this;
        }

        @JsOverlay
        public final Props onKeyDown(final Func.Run1<KeyboardEvent> onKeyDown) {
            this.onKeyDown = onKeyDown;
            return this;
        }

        @JsOverlay
        public final Props cols(final int cols) {
            this.cols = cols;
            return this;
        }

        @JsOverlay
        public final Props readOnly(final boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
