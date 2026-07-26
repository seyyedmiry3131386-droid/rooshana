package ir.mservices.market.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.b77;
import defpackage.bu6;
import defpackage.bv0;
import defpackage.ea7;
import defpackage.eq6;
import defpackage.f57;
import defpackage.f88;
import defpackage.js3;
import defpackage.js6;
import defpackage.kh2;
import defpackage.lw;
import defpackage.na7;
import defpackage.ne5;
import defpackage.pq6;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.t30;
import defpackage.t61;
import defpackage.u91;
import defpackage.uv1;
import defpackage.x80;
import defpackage.xe1;
import defpackage.xg8;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class AvatarImageView extends Hilt_AvatarImageView {
    public final xg8 c;
    public final ImageView d;
    public int e;
    public boolean f;
    public boolean g;
    public Drawable h;
    public int i;
    public int j;
    public bv0 k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarImageView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public static /* synthetic */ void setImage$default(AvatarImageView avatarImageView, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        avatarImageView.setImage(str, str2, num, num2);
    }

    public final int getBorderColor() {
        return this.j;
    }

    public final int getBorderWidth() {
        return this.i;
    }

    public final bv0 getColorGeneratorUtils() {
        bv0 bv0Var = this.k;
        if (bv0Var != null) {
            return bv0Var;
        }
        js3.V("colorGeneratorUtils");
        throw null;
    }

    public final Drawable getDefaultImage() {
        return this.h;
    }

    public final boolean getHasBorder() {
        return this.g;
    }

    public final void setBorderColor(int i) {
        this.j = i;
    }

    public final void setBorderWidth(int i) {
        this.i = i;
    }

    public final void setCircle(boolean z) {
        this.f = z;
    }

    public final void setColorGeneratorUtils(bv0 bv0Var) {
        js3.p(bv0Var, "<set-?>");
        this.k = bv0Var;
    }

    public final void setDefaultImage(Drawable drawable) {
        this.h = drawable;
    }

    public final void setErrorImageResId(int i) {
        this.e = i;
    }

    public final void setHasBorder(boolean z) {
        this.g = z;
    }

    public final void setImage(String str, String str2, Integer num, Integer num2) {
        int color;
        String strValueOf;
        f57 f57VarH;
        if (str2 == null || f88.n0(str2)) {
            str2 = " ";
        }
        if (str == null || f88.n0(str)) {
            List list = getColorGeneratorUtils().a;
            color = (!f88.n0(f88.J0(str2.toString()).toString()) ? str2 : null) != null ? Color.parseColor((String) list.get(Math.abs(str2.hashCode()) % list.size())) : 0;
        } else {
            color = num2 != null ? num2.intValue() : sj8.b().p;
        }
        String strI = "";
        if (str == null || f88.n0(str)) {
            String[] strArr = (String[]) new Regex(" ").i(str2).toArray(new String[0]);
            int iMin = Math.min(strArr.length, 2);
            Pattern patternCompile = Pattern.compile("\\w");
            for (int i = 0; i < iMin; i++) {
                String str3 = strArr[i];
                if (!f88.n0(str3)) {
                    Matcher matcher = patternCompile.matcher(str3);
                    if (!matcher.find() || (strValueOf = matcher.group(0)) == null) {
                        strValueOf = String.valueOf(str3.charAt(0));
                    }
                    if (!TextUtils.isEmpty(strI)) {
                        strI = t61.i(strI, "\u200c");
                    }
                    strI = t61.i(strI, strValueOf);
                }
            }
        }
        xg8 xg8Var = this.c;
        ImageView imageView = this.d;
        if (str == null || f88.n0(str)) {
            Drawable drawable = this.h;
            if (drawable == null) {
                drawable = xg8Var;
            }
            imageView.setImageDrawable(drawable);
        } else {
            xe1 xe1Var = new xe1(true);
            if (f88.n0(str)) {
                lw.g(null, "url is empty", null);
                str = "empty_url";
            }
            try {
                f57VarH = com.bumptech.glide.a.f(this).q(new ne5(str, null));
                js3.m(f57VarH);
            } catch (Exception unused) {
                f57VarH = t61.h(str, null, com.bumptech.glide.a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            x80 x80VarX = ((f57) f57VarH.k(this.e)).x(xg8Var);
            js3.o(x80VarX, "placeholder(...)");
            f57 f57Var = (f57) x80VarX;
            if (this.f) {
                x80 x80VarG = f57Var.G(new na7(Math.max(getLayoutParams().width, Math.max(getMeasuredWidth(), getWidth())) / 2));
                js3.o(x80VarG, "transform(...)");
                f57Var = (f57) x80VarG;
            }
            uv1 uv1Var = new uv1();
            uv1Var.a = xe1Var;
            f57Var.W(uv1Var).P(imageView);
        }
        if (num != null) {
            float[] fArr = new float[8];
            Arrays.fill(fArr, num.intValue());
            xg8Var.setShape(new RoundRectShape(fArr, null, null));
        }
        xg8Var.d = -1;
        xg8Var.e = -1;
        xg8Var.c = strI.toUpperCase();
        xg8Var.f = -1;
        Paint paint = new Paint();
        xg8Var.a = paint;
        paint.setColor(-1);
        xg8Var.a.setAntiAlias(true);
        xg8Var.a.setFakeBoldText(false);
        xg8Var.a.setStyle(Paint.Style.FILL);
        xg8Var.a.setTypeface((Typeface) kh2.b.a.b);
        xg8Var.a.setTextAlign(Paint.Align.CENTER);
        xg8Var.a.setStrokeWidth(xg8Var.g);
        Paint paint2 = new Paint();
        xg8Var.b = paint2;
        paint2.setColor(-1);
        xg8Var.b.setStyle(Paint.Style.STROKE);
        xg8Var.b.setStrokeWidth(xg8Var.g);
        xg8Var.getPaint().setColor(color);
        if (this.g && this.f) {
            int iMax = Math.max(getLayoutParams().width, Math.max(getMeasuredWidth(), getWidth())) / 2;
            Context context = getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.b = color;
            ea7Var.i = this.j;
            ea7Var.c(iMax);
            ea7Var.h = this.i;
            setBackground(ea7Var.a());
            int i2 = this.i;
            imageView.setPadding(i2, i2, i2, i2);
        }
    }

    public final void setSize(int i) {
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.k = (bv0) ((u91) ((t30) e())).a.o1.get();
        }
        this.j = -1;
        int[] iArr = bu6.AvatarImageView;
        js3.o(iArr, "AvatarImageView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f = typedArrayObtainStyledAttributes.getBoolean(bu6.AvatarImageView_circle, true);
        this.g = typedArrayObtainStyledAttributes.getBoolean(bu6.AvatarImageView_border, false);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.AvatarImageView_borderWidth, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(pq6.border_size));
        int i = bu6.AvatarImageView_borderColor;
        Resources resources = typedArrayObtainStyledAttributes.getResources();
        int i2 = eq6.white;
        ThreadLocal threadLocal = b77.a;
        this.j = typedArrayObtainStyledAttributes.getColor(i, resources.getColor(i2, null));
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, js6.avatar_image_view, this);
        View viewFindViewById = findViewById(rr6.image_view);
        js3.o(viewFindViewById, "findViewById(...)");
        this.d = (ImageView) viewFindViewById;
        xg8 xg8Var = new xg8(new OvalShape());
        xg8Var.g = -1;
        xg8Var.setPadding(new Rect());
        this.c = xg8Var;
        xg8Var.g = 0;
    }
}
