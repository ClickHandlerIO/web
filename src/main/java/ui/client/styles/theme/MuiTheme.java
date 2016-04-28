package ui.client.styles.theme;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class MuiTheme {
    public boolean isRtl;
    public String userAgent;
    public int zIndex;
    public BaseTheme baseTheme;
    public BaseTheme rawTheme; // for backward compatability
    public AppBarMuiTheme appBar;
    public AvatarMuiTheme avatar;
    public BadgeMuiTheme badge;
    public ButtonMuiTheme button;
    public CardTextMuiTheme cardText;
    public CheckboxMuiTheme checkbox;
    public DatePickerMuiTheme datePicker;
    public DropDownMenuMuiTheme dropDownMenu;
    public FlatButtonMuiTheme flatButton;
    public FloatingActionButtonMuiTheme floatingActionButton;
    public GridTileMuiTheme gridTile;
    public InkBarMuiTheme inkBar;
    public LeftNavMuiTheme leftNav;
    public ListItemMuiTheme listItem;
    public MenuMuiTheme menu;
    public MenuItemMuiTheme menuItem;
    public MenuSubheaderMuiTheme menuSubheader;
    public PaperMuiTheme paper;
    public RadioButtonMuiTheme radioButton;
    public RaisedButtonMuiTheme raisedButton;
    public RefreshIndicatorMuiTheme refreshIndicator;
    public SliderMuiTheme slider;
    public SnackbarMuiTheme snackbar;
    public TableMuiTheme table;
    public TableHeaderMuiTheme tableHeader;
    public TableHeaderColumnMuiTheme tableHeaderColumn;
    public TableFooterMuiTheme tableFooter;
    public TableRowMuiTheme tableRow;
    public TableRowColumnMuiTheme tableRowColumn;
    public TimePickerMuiTheme timePicker;
    public ToggleMuiTheme toggle;
    public ToolbarMuiTheme toolbar;
    public TabsMuiTheme tabs;
    public TextFieldMuiTheme textField;

    @JsMethod(namespace = "MaterialUi.Styles", name = "MuiTheme")
    public static native MuiTheme get();
}