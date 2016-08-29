package ui.client;

import common.client.Func;
import elemental.html.InputElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import react.client.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static react.client.DOM.input;

@Singleton
public class TextInput extends Component<TextInput.Props, TextInput.State> {

    @Inject
    public TextInput() {
    }

    @Override
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return input(new HTMLProps()
                .id($this.props.id)
                .className("" + $this.props.className)
                .type($this.props.type)
                .style($this.props.style)
                .disabled($this.props.disabled)
                .zIndex($this.props.zIndex)
                .placeholder($this.props.placeholder)
                .value($this.props.value != null ? $this.props.value : "")
                .onFocus(event -> {
                    if ($this.props.onFocus != null) {
                        $this.props.onFocus.run(event);
                    }
                })
                .onBlur(event -> {
                    if ($this.props.onBlur != null) {
                        $this.props.onBlur.run(event);
                    }
                })
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

    @Override
    protected boolean shouldComponentUpdate(ReactComponent<Props, State> $this, Props nextProps, State nextState) {
        boolean shouldUpdate = super.shouldComponentUpdate($this, nextProps, nextState);
        return shouldUpdate;
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
        public String type;
        public Func.Run1<KeyboardEvent> onKeyDown;
        public Func.Run1<FocusEvent> onFocus;
        public Func.Run1<FocusEvent> onBlur;

        @JsOverlay
        public final Props onFocus(final Func.Run1<FocusEvent> onFocus) {
            this.onFocus = onFocus;
            return this;
        }

        @JsOverlay
        public final Props onBlur(final Func.Run1<FocusEvent> onBlur) {
            this.onBlur = onBlur;
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
        public final Props type(final String type) {
            this.type = type;
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
    }

    @JsType(isNative = true, name = "Object", namespace = GLOBAL)
    public static class State {
    }
}
