///**
// * Default launcher application.默认启动器应用程序
// */
//public class Launcher extends BaseActivity
//        implements LauncherExterns, View.OnClickListener, OnLongClickListener,
//        LauncherModel.Callbacks, View.OnTouchListener, LauncherProviderChangeListener,
//        AccessibilityManager.AccessibilityStateChangeListener,
//        WallpaperColorInfo.OnThemeChangeListener {
//
//
//    /**
//     * Launches the intent referred by the clicked shortcut.
//     * 启动单击的快捷方式引用的意图
//     * @param v The view representing the clicked shortcut.
//     */
//    public void onClick(View v) {
//        // Make sure that rogue clicks don't get through while allapps is launching, or after the
//        // view has detached (it's possible for this to happen if the view is removed mid touch).
//        Object tag = v.getTag();
//        if (tag instanceof ShortcutInfo) {
//            onClickAppShortcut(v);
//        }else if(){
//			...
//        } else if (tag instanceof AppInfo) {
//            startAppShortcutOrInfoActivity(v);
//        } else if (tag instanceof LauncherAppWidgetInfo) {
//            ...
//        }
//    }
//
//    /**
//     * Event handler for an app shortcut click.
//     * 应用程序快捷方式单击的事件处理
//     * @param v The view that was clicked. Must be a tagged with a {@link ShortcutInfo}.
//     */
//    protected void onClickAppShortcut(final View v) {
//		...
//        // Start activities
//        startAppShortcutOrInfoActivity(v);
//    }
//    private void startAppShortcutOrInfoActivity(View v) {
//        ItemInfo item = (ItemInfo) v.getTag();
//        ...
//        boolean success = startActivitySafely(v, intent, item);
//        getUserEventDispatcher().logAppLaunch(v, intent); // TODO for discovered apps b/35802115
//       ...
//    }
//    public boolean startActivitySafely(View v, Intent intent, ItemInfo item) {
//        if (mIsSafeModeEnabled && !Utilities.isSystemApp(this, intent)) {
//            Toast.makeText(this, R.string.safemode_shortcut_error, Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        // Only launch using the new animation if the shortcut has not opted out (this is a
//        // private contract between launcher and may be ignored in the future).
//        boolean useLaunchAnimation = (v != null) &&
//                !intent.hasExtra(INTENT_EXTRA_IGNORE_LAUNCH_ANIMATION);
//        Bundle optsBundle = useLaunchAnimation ? getActivityLaunchOptions(v) : null;
//        UserHandle user = item == null ? null : item.user;
//		...
//        // Prepare intent
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        //1.设置Flag为Intent.FLAG_ACTIVITY_NEW_TASK这样根Activity会在新的任务栈中启动
//        if (v != null) {
//            intent.setSourceBounds(getViewBounds(v));
//        }
//        try {
//            if (Utilities.ATLEAST_MARSHMALLOW
//                    && (item instanceof ShortcutInfo)
//                    && (item.itemType == Favorites.ITEM_TYPE_SHORTCUT
//                    || item.itemType == Favorites.ITEM_TYPE_DEEP_SHORTCUT)
//                    && !((ShortcutInfo) item).isPromise()) {
//                // Shortcuts need some special checks due to legacy reasons.
//                startShortcutIntentSafely(intent, optsBundle, item);
//            } else if (user == null || user.equals(Process.myUserHandle())) {
//                // Could be launching some bookkeeping activity
//                startActivity(intent, optsBundle);//2.调用startActivity()方法的实现在Activity.
//            } else {
//                LauncherAppsCompat.getInstance(this).startActivityForProfile(
//                        intent.getComponent(), user, intent.getSourceBounds(), optsBundle);
//            }
//            return true;
//        } catch (ActivityNotFoundException|SecurityException e) {
//            Toast.makeText(this, R.string.activity_not_found, Toast.LENGTH_SHORT).show();
//            Log.e(TAG, "Unable to launch. tag=" + item + " intent=" + intent, e);
//        }
//        return false;
//    }
//
//}