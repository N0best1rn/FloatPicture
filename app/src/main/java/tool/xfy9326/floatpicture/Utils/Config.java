package tool.xfy9326.floatpicture.Utils;

import android.os.Environment;

import java.io.File;

public class Config {
    public final static int NOTIFICATION_ID = 4500;

    public final static int REQUEST_CODE_PERMISSION_STORAGE = 1;
    public final static int REQUEST_CODE_PERMISSION_OVERLAY = 2;
    public final static int REQUEST_CODE_ACTIVITY_PICTURE_SETTINGS_ADD = 3;
    public final static int REQUEST_CODE_ACTIVITY_PICTURE_SETTINGS_GET_PICTURE = 4;
    public final static int REQUEST_CODE_ACTIVITY_PICTURE_SETTINGS_CHANGE = 5;

    public final static String INTENT_PICTURE_EDIT_POSITION = "EDIT_POSITION";
    public final static String INTENT_PICTURE_EDIT_ID = "EDIT_ID";
    public final static String INTENT_PICTURE_EDIT_MODE = "EDIT_MODE";
    public final static String INTENT_PICTURE_CHOOSE_PICTURE = "CHOOSE_PICTURE";

    public final static String INTENT_ACTION_NOTIFICATION_BUTTON_CLICK = "ACTION_NOTIFICATION_BUTTON_CLICK";
    public final static String INTENT_ACTION_NOTIFICATION_UPDATE_COUNT = "ACTION_NOTIFICATION_UPDATE_COUNT";

    public final static String DATA_PICTURE_SHOW_ENABLED = "SHOW_ENABLED";
    public final static String DATA_PICTURE_POSITION_X = "POSITION_X";
    public final static String DATA_PICTURE_POSITION_Y = "POSITION_Y";
    public final static String DATA_PICTURE_ZOOM = "ZOOM";
    public final static String DATA_PICTURE_DEFAULT_ZOOM = "DEFAULT_ZOOM";
    public final static String DATA_PICTURE_ALPHA = "ALPHA";
    public final static String DATA_PICTURE_DEGREE = "DEGREE";
    public final static String DATA_PICTURE_TOUCH_AND_MOVE = "TOUCH_AND_MOVE";

    public final static boolean DATA_DEFAULT_PICTURE_SHOW_ENABLED = true;
    public final static int DATA_DEFAULT_PICTURE_POSITION_X = 100;
    public final static int DATA_DEFAULT_PICTURE_POSITION_Y = 100;
    public final static float DATA_DEFAULT_PICTURE_ALPHA = 0.5f;
    public final static float DATA_DEFAULT_PICTURE_DEGREE = 0f;
    public final static boolean DATA_DEFAULT_PICTURE_TOUCH_AND_MOVE = false;

    public final static String PREFERENCE_PICTURE_NAME = "settings_picture_name";
    public final static String PREFERENCE_PICTURE_ID = "settings_picture_id";
    public final static String PREFERENCE_PICTURE_RESIZE = "settings_picture_resize";
    public final static String PREFERENCE_PICTURE_ALPHA = "settings_picture_alpha";
    public final static String PREFERENCE_PICTURE_POSITION = "settings_picture_position";
    public final static String PREFERENCE_PICTURE_DEGREE = "settings_picture_degree";
    public final static String PREFERENCE_PICTURE_TOUCH_AND_MOVE = "settings_picture_touchable_and_moveable";

    public final static String PREFERENCE_BOOT_AUTO_RUN = "boot_auto_run";
    public final static String PREFERENCE_SHOW_NOTIFICATION_CONTROL = "show_notification_control";
    public final static String PREFERENCE_NEW_PICTURE_QUALITY = "new_picture_quality";
    public final static String PREFERENCE_TOUCHABLE_POSITION_EDIT = "touchable_position_edit";

    public final static String LICENSE_PATH_APPLICATION = "LICENSE";
    private final static String DEFAULT_ROOT_DIR = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
    private final static String DEFAULT_APPLICATION_DIR = DEFAULT_ROOT_DIR + "FloatPicture" + File.separator;
    public final static String DEFAULT_PICTURE_TEMP_DIR = DEFAULT_APPLICATION_DIR + "Pictures" + File.separator + ".TEMP" + File.separator;
    final static String DEFAULT_DATA_DIR = DEFAULT_APPLICATION_DIR + "Data" + File.separator;
    public final static String DEFAULT_PICTURE_DIR = DEFAULT_APPLICATION_DIR + "Pictures" + File.separator;
    public final static String NO_MEDIA_FILE_DIR = DEFAULT_APPLICATION_DIR + File.separator + ".nomedia";
}
