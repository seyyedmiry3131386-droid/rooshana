package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.b;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a27 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public a27() {
        yu6.a.getClass();
        yu6.b.a(6);
    }

    public static ub8 a() {
        return new ub8(null);
    }

    public static final boolean b(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !js3.i(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!b((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!ew.u0((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int c(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iC = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iC = (iC * 31) + (obj instanceof Bundle ? c((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return iC;
    }

    public static ColorStateList d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!j(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = qv0.a;
        try {
            return qv0.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            t0.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static pg e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        pg pgVarD;
        if (j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new pg((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                pgVarD = pg.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                t0.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                pgVarD = null;
            }
            if (pgVarD != null) {
                return pgVarD;
            }
        }
        return new pg((Shader) null, (ColorStateList) null, 0);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static String g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static final RecyclerView h(ViewPager2 viewPager2) {
        js3.p(viewPager2, "<this>");
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            return recyclerView;
        }
        throw new IllegalStateException("ViewPager2 does not have a RecyclerView child yet.");
    }

    public static final ri8 i(en7 en7Var) {
        dp2 dp2Var;
        ArrayList arrayList = new ArrayList();
        e3 e3Var = (e3) b.a(en7Var, a.a);
        if (e3Var == null || (dp2Var = (dp2) e3Var.b) == null || !((Boolean) dp2Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (ri8) arrayList.get(0);
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final AndroidViewHolder l(AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((h) ((Map.Entry) next).getKey()).b == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String m(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static void n(int i, int i2) {
        String strO;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strO = h27.o("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(rm7.n(i2, "negative size: "));
                }
                strO = h27.o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strO);
        }
    }

    public static void o(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? p("start index", i, i3) : (i2 < 0 || i2 > i3) ? p("end index", i2, i3) : h27.o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String p(String str, int i, int i2) {
        if (i < 0) {
            return h27.o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h27.o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(rm7.n(i2, "negative size: "));
    }
}
