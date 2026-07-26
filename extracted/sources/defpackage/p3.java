package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.UriPermission;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.Vibrator;
import android.os.ext.SdkExtensions;
import android.provider.DocumentsContract;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.core.content.ContextCompat;
import io.sentry.android.core.t0;
import ir.mservices.market.core.notification.a;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p3 {
    public static int a(int i, int i2) {
        return Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i2 & 255), Integer.valueOf(i & 16777215)}, 2)));
    }

    public static boolean b(String str) {
        js3.p(str, "destFilePath");
        if (Build.VERSION.SDK_INT <= 29) {
            return true;
        }
        File file = new File(str);
        return (file.mkdirs() || file.isDirectory()) && file.canWrite();
    }

    public static int c(Context context, String str) {
        js3.p(context, "context");
        js3.p(str, "permissionManifestId");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (str.equals("android.permission.WRITE_EXTERNAL_STORAGE") || str.equals("android.permission.READ_EXTERNAL_STORAGE"))) {
            return Environment.isExternalStorageManager() ? 0 : -1;
        }
        if (i < 33 && str.equals("android.permission.POST_NOTIFICATIONS")) {
            return a.d(context, "download") ? -1 : 0;
        }
        if (!str.equals("android.permission.PACKAGE_USAGE_STATS")) {
            return ContextCompat.checkSelfPermission(context, str);
        }
        int iQ = bt2.q(Process.myUid(), context, "android:get_usage_stats", context.getPackageName());
        return iQ == 3 ? context.checkCallingOrSelfPermission("android.permission.PACKAGE_USAGE_STATS") == 0 ? 0 : -1 : iQ == 0 ? 0 : -1;
    }

    public static boolean d(Activity activity2) {
        int i = Build.VERSION.SDK_INT;
        Object obj = null;
        Uri uriBuildTreeDocumentUri = i <= 29 ? null : DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", "primary:Android/obb");
        if (uriBuildTreeDocumentUri != null && activity2 != null) {
            boolean zIsExternalStorageManager = i >= 33 ? Environment.isExternalStorageManager() : false;
            List<UriPermission> persistedUriPermissions = activity2.getContentResolver().getPersistedUriPermissions();
            js3.o(persistedUriPermissions, "getPersistedUriPermissions(...)");
            Iterator<T> it = persistedUriPermissions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                UriPermission uriPermission = (UriPermission) next;
                if (uriPermission.getUri().equals(uriBuildTreeDocumentUri) && uriPermission.isReadPermission()) {
                    obj = next;
                    break;
                }
            }
            if (obj != null || zIsExternalStorageManager) {
                return true;
            }
        }
        return false;
    }

    public static Context e(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon f(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static GraphicUtils$Dimension g(Activity activity2) {
        int iHeight;
        int iWidth;
        if (activity2 == null) {
            iHeight = 0;
            iWidth = 0;
        } else if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = activity2.getWindowManager().getCurrentWindowMetrics();
            js3.o(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            js3.o(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
            iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
        } else {
            Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
            Rect rect = new Rect();
            defaultDisplay.getRectSize(rect);
            iWidth = rect.width();
            iHeight = rect.height();
        }
        return new GraphicUtils$Dimension(iWidth, iHeight);
    }

    public static String h(Context context) {
        return context.getAttributionTag();
    }

    public static Rect i(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }

    public static Display j(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            t0.m("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    public static Drawable k(Resources resources, int i) {
        js3.p(resources, "res");
        try {
            q39 q39VarA = q39.a(resources, i, null);
            if (q39VarA != null) {
                return q39VarA;
            }
            ThreadLocal threadLocal = b77.a;
            Drawable drawable = resources.getDrawable(i, null);
            if (drawable != null) {
                return drawable;
            }
            throw new Resources.NotFoundException();
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            Drawable drawable2 = resources.getDrawable(i, null);
            if (drawable2 != null) {
                return drawable2;
            }
            throw new Resources.NotFoundException();
        }
    }

    public static void l(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets n(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean o(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }

    public static boolean p(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean q(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean r(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void s(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void t(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void u(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void v(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void w(Outline outline, u26 u26Var) {
        if (!(u26Var instanceof eh)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((eh) u26Var).a);
    }

    public static void x(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void y(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            wn5.H("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
