import injectTapEventPlugin from "react-tap-event-plugin";
import AppBar from "material-ui/AppBar";
import AutoComplete from "material-ui/AutoComplete";
import Avatar from "material-ui/Avatar";
import Badge from "material-ui/Badge";
import Card from "material-ui/card/Card";
import CircularProgress from "material-ui/CircularProgress";
import Checkbox from "material-ui/Checkbox";
import Colors from "material-ui/styles/colors";
import ColorManipulator from "material-ui/utils/colorManipulator";
import DatePicker from "material-ui/DatePicker";
import Dialog from "material-ui/Dialog";
import Divider from "material-ui/Divider";
import Drawer from "material-ui/Drawer";
import DropDownMenu from "material-ui/DropDownMenu";
import FlatButton from "material-ui/FlatButton";
import FloatingActionButton from "material-ui/FloatingActionButton";
import FontIcon from "material-ui/FontIcon";
import GridList from "material-ui/GridList";
import IconButton from "material-ui/IconButton";
import IconMenu from "material-ui/IconMenu";
import LinearProgress from "material-ui/LinearProgress";
import List from "material-ui/List/List";
import ListItem from "material-ui/List/ListItem";
import Menu from "material-ui/Menu/Menu";
import MenuItem from "material-ui/MenuItem";
import MuiTheme from "material-ui/styles/GetMuiTheme";
import Paper from "material-ui/Paper";
import Popover from "material-ui/Popover/Popover";
import RadioButton from "material-ui/RadioButton/RadioButton";
import RadioButtonGroup from "material-ui/RadioButton/RadioButtonGroup";
import RefreshIndicator from "material-ui/RefreshIndicator";
import SelectField from "material-ui/SelectField";
import Slider from "material-ui/Slider";
import Snackbar from "material-ui/Snackbar";
import Spacing from "material-ui/styles/spacing";
import SvgIcon from "material-ui/SvgIcon";
import Tab from "material-ui/tabs/Tab";
import Tabs from "material-ui/tabs/Tabs";
import Table from "material-ui/table/Table";
import TableRow from "material-ui/table/TableRow";
import TableRowColumn from "material-ui/table/TableRowColumn";
import TableHeader from "material-ui/table/TableHeader";
import TableHeaderColumn from "material-ui/table/TableHeaderColumn";
import TableBody from "material-ui/table/TableBody";
import TableFooter from "material-ui/table/TableFooter";
import TextField from "material-ui/TextField/TextField";
import TimePicker from "material-ui/TimePicker";
import Toolbar from "material-ui/Toolbar/Toolbar";
import ToolbarGroup from "material-ui/Toolbar/ToolbarGroup";
import ToolbarSeparator from "material-ui/Toolbar/ToolbarSeparator";
import ToolbarTitle from "material-ui/Toolbar/ToolbarTitle";
import Toggle from "material-ui/Toggle";
import Typography from "material-ui/styles/typography";
import RaisedButton from "material-ui/RaisedButton";
import ZIndex from "material-ui/styles/zIndex";
import AccountBoxSvgIcon from "material-ui/svg-icons/action/account-box";
import AccountCircleSvgIcon from "material-ui/svg-icons/action/account-circle";
import AddSvgIcon from "material-ui/svg-icons/content/add";
import AddBoxSvgIcon from "material-ui/svg-icons/content/add-box";
import AddCircleSvgIcon from "material-ui/svg-icons/content/add-circle";
import AddCircleOutlineSvgIcon from "material-ui/svg-icons/content/add-circle-outline";
import AddShoppingCartSvgIcon from "material-ui/svg-icons/action/add-shopping-cart";
import ArchiveSvgIcon from "material-ui/svg-icons/content/archive";
import ArrowDropDownSvgIcon from "material-ui/svg-icons/navigation/arrow-drop-down";
import ArrowDropUpSvgIcon from "material-ui/svg-icons/navigation/arrow-drop-up";
import AttachFileSvgIcon from "material-ui/svg-icons/editor/attach-file";
import CheckSvgIcon from "material-ui/svg-icons/navigation/check";
import CheckCircleSvgIcon from "material-ui/svg-icons/action/check-circle";
import ChevronLeftSvgIcon from "material-ui/svg-icons/navigation/chevron-left";
import ChevronRightSvgIcon from "material-ui/svg-icons/navigation/chevron-right";
import CloseSvgIcon from "material-ui/svg-icons/navigation/close";
import CloudDownloadSvgIcon from "material-ui/svg-icons/file/cloud-download";
import CloudUploadSvgIcon from "material-ui/svg-icons/file/cloud-upload";
import DeleteSvgIcon from "material-ui/svg-icons/action/delete";
import DragHandleSvgIcon from "material-ui/svg-icons/editor/drag-handle";
import EmailSvgIcon from "material-ui/svg-icons/communication/email";
import FileDownloadSvgIcon from "material-ui/svg-icons/file/file-download";
import FileUploadSvgIcon from "material-ui/svg-icons/file/file-upload";
import FilterListSvgIcon from "material-ui/svg-icons/content/filter-list";
import GpsFixedSvgIcon from "material-ui/svg-icons/device/gps-fixed";
import InsertDriveFileSvgIcon from "material-ui/svg-icons/editor/insert-drive-file";
import KeyboardArrowDownSvgIcon from "material-ui/svg-icons/hardware/keyboard-arrow-down";
import LaunchSvgIcon from "material-ui/svg-icons/action/launch";
import MailOutlineSvgIcon from "material-ui/svg-icons/communication/mail-outline";
import MenuSvgIcon from "material-ui/svg-icons/navigation/menu";
import MoreHorizSvgIcon from "material-ui/svg-icons/navigation/more-horiz";
import MoreVertSvgIcon from "material-ui/svg-icons/navigation/more-vert";
import NotificationsSvgIcon from "material-ui/svg-icons/social/notifications";
import PersonAddSvgIcon from "material-ui/svg-icons/social/person-add";
import PowerSettingsNewSvgIcon from "material-ui/svg-icons/action/power-settings-new";
import PrintSvgIcon from "material-ui/svg-icons/action/print";
import ReplySvgIcon from "material-ui/svg-icons/content/reply";
import RemoveCircleSvgIcon from "material-ui/svg-icons/content/remove-circle";
import RemoveCircleOutlineSvgIcon from "material-ui/svg-icons/content/remove-circle-outline";
import SearchSvgIcon from "material-ui/svg-icons/action/search";
import SendSvgIcon from "material-ui/svg-icons/content/send";
import StorageSvgIcon from "material-ui/svg-icons/device/storage";
import UnarchiveSvgIcon from "material-ui/svg-icons/content/unarchive";

window.MaterialUi = {
    AppBar: AppBar,
    AutoComplete: AutoComplete,
    Avatar: Avatar,
    Badge: Badge,
    Card: Card,
    CircularProgress: CircularProgress,
    Checkbox: Checkbox,
    DatePicker: DatePicker,
    Dialog: Dialog,
    Divider: Divider,
    Drawer: Drawer,
    DropDownMenu: DropDownMenu,
    GridList: GridList,
    FlatButton: FlatButton,
    FloatingActionButton: FloatingActionButton,
    FontIcon: FontIcon,
    IconButton: IconButton,
    IconMenu: IconMenu,
    LinearProgress: LinearProgress,
    List: List,
    ListItem: ListItem,
    Menu: Menu,
    MenuItem: MenuItem,
    Paper: Paper,
    Popover: Popover,
    RadioButton: RadioButton,
    RadioButtonGroup: RadioButtonGroup,
    RaisedButton: RaisedButton,
    RefreshIndicator: RefreshIndicator,
    SelectField: SelectField,
    Slider: Slider,
    Snackbar: Snackbar,
    SvgIcon: SvgIcon,
    Tab: Tab,
    Tabs: Tabs,
    Table: Table,
    TableRow: TableRow,
    TableRowColumn: TableRowColumn,
    TableHeader: TableHeader,
    TableHeaderColumn: TableHeaderColumn,
    TableBody: TableBody,
    TableFooter: TableFooter,
    TextField: TextField,
    TimePicker: TimePicker,
    Toolbar: Toolbar,
    ToolbarGroup: ToolbarGroup,
    ToolbarSeparator: ToolbarSeparator,
    ToolbarTitle: ToolbarTitle,
    Toggle: Toggle,
    Icons: {
        AccountBox: AccountBoxSvgIcon,
        AccountCircle: AccountCircleSvgIcon,
        Add: AddSvgIcon,
        AddBox: AddBoxSvgIcon,
        AddCircle: AddCircleSvgIcon,
        AddCircleOutline: AddCircleOutlineSvgIcon,
        AddShoppingCart: AddShoppingCartSvgIcon,
        Archive: ArchiveSvgIcon,
        ArrowDropUp: ArrowDropUpSvgIcon,
        ArrowDropDown: ArrowDropDownSvgIcon,
        AttachFile: AttachFileSvgIcon,
        Check: CheckSvgIcon,
        CheckCircle: CheckCircleSvgIcon,
        ChevronLeft: ChevronLeftSvgIcon,
        ChevronRight: ChevronRightSvgIcon,
        CloudDownload: CloudDownloadSvgIcon,
        CloudUpload: CloudUploadSvgIcon,
        Close: CloseSvgIcon,
        Delete: DeleteSvgIcon,
        DragHandle: DragHandleSvgIcon,
        Email: EmailSvgIcon,
        FileDownload: FileDownloadSvgIcon,
        FileUpload: FileUploadSvgIcon,
        FilterList: FilterListSvgIcon,
        GpsFixed: GpsFixedSvgIcon,
        InsertDriveFile: InsertDriveFileSvgIcon,
        KeyboardArrowDown: KeyboardArrowDownSvgIcon,
        Launch: LaunchSvgIcon,
        MailOutline: MailOutlineSvgIcon,
        Menu: MenuSvgIcon,
        MoreHoriz: MoreHorizSvgIcon,
        MoreVert: MoreVertSvgIcon,
        Notifications: NotificationsSvgIcon,
        PersonAdd: PersonAddSvgIcon,
        PowerSettingsNew: PowerSettingsNewSvgIcon,
        Print: PrintSvgIcon,
        Reply: ReplySvgIcon,
        RemoveCircle: RemoveCircleSvgIcon,
        RemoveCircleOutline: RemoveCircleOutlineSvgIcon,
        Search: SearchSvgIcon,
        Send: SendSvgIcon,
        Storage: StorageSvgIcon,
        Unarchive: UnarchiveSvgIcon
    },
    Styles: {
        Colors: Colors,
        MuiTheme: MuiTheme,
        Spacing: Spacing,
        Typography: Typography,
        ZIndex: ZIndex
    },
    DarkTheme: getMuiTheme(DarkBaseTheme),
    LightTheme: getMuiTheme(LightBaseTheme),
    Utils: {
        ColorManipulator: ColorManipulator
    }
};
injectTapEventPlugin();
