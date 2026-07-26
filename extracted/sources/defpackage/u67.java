package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.ContextCompat;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class u67 {
    public static u67 i;
    public WeakHashMap a;
    public fw7 b;
    public m28 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public on g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final s67 j = new s67(6);

    public static synchronized u67 d() {
        try {
            if (i == null) {
                u67 u67Var = new u67();
                i = u67Var;
                j(u67Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        s67 s67Var = j;
        s67Var.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) s67Var.get(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(u67 u67Var) {
        if (Build.VERSION.SDK_INT < 24) {
            u67Var.a("vector", new t67(3));
            u67Var.a("animated-vector", new t67(2));
            u67Var.a("animated-selector", new t67(1));
            u67Var.a("drawable", new t67(0));
        }
    }

    public final void a(String str, t67 t67Var) {
        if (this.b == null) {
            this.b = new fw7(0);
        }
        this.b.put(str, t67Var);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                ue4 ue4Var = (ue4) this.d.get(context);
                if (ue4Var == null) {
                    ue4Var = new ue4((Object) null);
                    this.d.put(context, ue4Var);
                }
                ue4Var.i(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableN = null;
        if (this.g != null) {
            if (i2 == cr6.abc_cab_background_top_material) {
                layerDrawableN = new LayerDrawable(new Drawable[]{f(context, cr6.abc_cab_background_internal_bg), f(context, cr6.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == cr6.abc_ratingbar_material) {
                layerDrawableN = on.n(this, context, rq6.abc_star_big);
            } else if (i2 == cr6.abc_ratingbar_indicator_material) {
                layerDrawableN = on.n(this, context, rq6.abc_star_medium);
            } else if (i2 == cr6.abc_ratingbar_small_material) {
                layerDrawableN = on.n(this, context, rq6.abc_star_small);
            }
        }
        if (layerDrawableN != null) {
            layerDrawableN.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawableN);
        }
        return layerDrawableN;
    }

    public final synchronized Drawable e(Context context, long j2) {
        ue4 ue4Var = (ue4) this.d.get(context);
        if (ue4Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) ue4Var.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            ue4Var.j(j2);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable drawableK;
        try {
            if (!this.f) {
                this.f = true;
                Drawable drawableF = f(context, tq6.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof q39) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i2);
            if (drawableK == null) {
                drawableK = c(context, i2);
            }
            if (drawableK == null) {
                drawableK = ContextCompat.getDrawable(context, i2);
            }
            if (drawableK != null) {
                drawableK = n(context, i2, z, drawableK);
            }
            if (drawableK != null) {
                aw1.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        m28 m28Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListO = null;
        colorStateList = (weakHashMap == null || (m28Var = (m28) weakHashMap.get(context)) == null) ? null : (ColorStateList) m28Var.c(i2);
        if (colorStateList == null) {
            on onVar = this.g;
            if (onVar != null) {
                colorStateListO = onVar.o(context, i2);
            }
            if (colorStateListO != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                m28 m28Var2 = (m28) this.a.get(context);
                if (m28Var2 == null) {
                    m28Var2 = new m28(0);
                    this.a.put(context, m28Var2);
                }
                m28Var2.a(i2, colorStateListO);
            }
            colorStateList = colorStateListO;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        fw7 fw7Var = this.b;
        if (fw7Var == null || fw7Var.isEmpty()) {
            return null;
        }
        m28 m28Var = this.c;
        if (m28Var != null) {
            String str = (String) m28Var.c(i2);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.b.get(str) == null) {
                return null;
            }
        } else {
            this.c = new m28(0);
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                t67 t67Var = (t67) this.b.get(name);
                if (t67Var != null) {
                    drawableE = t67Var.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, drawableE);
                }
            } catch (Exception e) {
                t0.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableE == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        ue4 ue4Var = (ue4) this.d.get(context);
        if (ue4Var != null) {
            ue4Var.b();
        }
    }

    public final synchronized void m(on onVar) {
        this.g = onVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u67.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
