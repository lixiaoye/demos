//package lxy.android.com.multiprocess1;
//
///**
// * Created by LIXIAOYE on 2019/1/21.
// */
//
//public class Test {
//    public static final ProcessStartResult start(final String processClass,
//                                                 final String niceName,
//                                                 int uid, int gid, int[] gids,
//                                                 int runtimeFlags, int mountExternal,
//                                                 int targetSdkVersion,
//                                                 String seInfo,
//                                                 String abi,
//                                                 String instructionSet,
//                                                 String appDataDir,
//                                                 String invokeWith,
//                                                 String[] zygoteArgs) {
//        return zygoteProcess.start(processClass, niceName, uid, gid, gids,
//                runtimeFlags, mountExternal, targetSdkVersion, seInfo,
//                abi, instructionSet, appDataDir, invokeWith, zygoteArgs);
//    }
//
//    /**
//     * Launches the intent referred by the clicked shortcut.
//     *
//     * @param v The view representing the clicked shortcut.
//     */
//    public void onClick(View v) {
//        // Make sure that rogue clicks don't get through while allapps is launching, or after the
//        // view has detached (it's possible for this to happen if the view is removed mid touch).
//        if (v.getWindowToken() == null) {
//            return;
//        }
//        if (!mWorkspace.isFinishedSwitchingState()) {
//            return;
//        }
//        Object tag = v.getTag();
//        if (tag instanceof ShortcutInfo) {
//            // Open shortcut
//            final Intent intent = ((ShortcutInfo) tag).intent;
//            int[] pos = new int[2];
//            v.getLocationOnScreen(pos);
//            intent.setSourceBounds(new Rect(pos[0], pos[1],
//                    pos[0] + v.getWidth(), pos[1] + v.getHeight()));
//            boolean success = startActivitySafely(v, intent, tag);
//            if (success && v instanceof BubbleTextView) {
//                mWaitingForResume = (BubbleTextView) v;
//                mWaitingForResume.setStayPressed(true);
//            }
//        } else if (tag instanceof FolderInfo) {
//            if (v instanceof FolderIcon) {
//                FolderIcon fi = (FolderIcon) v;
//                handleFolderClick(fi);
//            }
//        } else if (v == mAllAppsButton) {
//            if (isAllAppsVisible()) {
//                showWorkspace(true);
//            } else {
//                onClickAllAppsButton(v);
//            }
//        }
//    }
//    boolean startActivitySafely(View v, Intent intent, Object tag) {
//        boolean success = false;
//        try {
//            success = startActivity(v, intent, tag);
//        } catch (ActivityNotFoundException e) {
//            Toast.makeText(this, R.string.activity_not_found, Toast.LENGTH_SHORT).show();
//            Log.e(TAG, "Unable to launch. tag=" + tag + " intent=" + intent, e);
//        }
//        return success;
//    }
//
//    boolean startActivity(View v, Intent intent, Object tag) {
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        try {
//            // Only launch using the new animation if the shortcut has not opted out (this is a
//            // private contract between launcher and may be ignored in the future).
//            boolean useLaunchAnimation = (v != null) &&
//                    !intent.hasExtra(INTENT_EXTRA_IGNORE_LAUNCH_ANIMATION);
//            UserHandle user = (UserHandle) intent.getParcelableExtra(ApplicationInfo.EXTRA_PROFILE);
//            LauncherApps launcherApps = (LauncherApps)
//                    this.getSystemService(Context.LAUNCHER_APPS_SERVICE);
//            if (useLaunchAnimation) {
//                ActivityOptions opts = ActivityOptions.makeScaleUpAnimation(v, 0, 0,
//                        v.getMeasuredWidth(), v.getMeasuredHeight());
//                if (user == null || user.equals(android.os.Process.myUserHandle())) {
//                    // Could be launching some bookkeeping activity
//                    startActivity(intent, opts.toBundle());
//                } else {
//                    launcherApps.startMainActivity(intent.getComponent(), user,
//                            intent.getSourceBounds(),
//                            opts.toBundle());
//                }
//            } else {
//                if (user == null || user.equals(android.os.Process.myUserHandle())) {
//                    startActivity(intent);
//                } else {
//                    launcherApps.startMainActivity(intent.getComponent(), user,
//                            intent.getSourceBounds(), null);
//                }
//            }
//            return true;
//        } catch (SecurityException e) {
//            Toast.makeText(this, R.string.activity_not_found, Toast.LENGTH_SHORT).show();
//            Log.e(TAG, "Launcher does not have the permission to launch " + intent +
//                    ". Make sure to create a MAIN intent-filter for the corresponding activity " +
//                    "or use the exported attribute for this activity. "
//                    + "tag="+ tag + " intent=" + intent, e);
//        }
//        return false;
//    }
//----------
//    /**
//     * Starts a Main activity in the specified profile.
//     *
//     * @param component The ComponentName of the activity to launch
//     * @param user The UserHandle of the profile
//     * @param sourceBounds The Rect containing the source bounds of the clicked icon
//     * @param opts Options to pass to startActivity
//     */
//    private final ILauncherApps mService;
//    public void startMainActivity(ComponentName component, UserHandle user, Rect sourceBounds,
//                                  Bundle opts) {
//        logErrorForInvalidProfileAccess(user);
//        if (DEBUG) {
//            Log.i(TAG, "StartMainActivity " + component + " " + user.getIdentifier());
//        }
//        try {
//            mService.startActivityAsUser(mContext.getPackageName(),
//                    component, sourceBounds, opts, user);
//        } catch (RemoteException re) {
//            throw re.rethrowFromSystemServer();
//        }
//    }
//}
