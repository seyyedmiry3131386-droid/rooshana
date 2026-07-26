package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.badge.BadgeState$State;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e50 {
    public final BadgeState$State a;
    public final BadgeState$State b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    public e50(Context context, BadgeState$State badgeState$State) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i = d50.o;
        int i2 = d50.n;
        this.b = new BadgeState$State();
        badgeState$State = badgeState$State == null ? new BadgeState$State() : badgeState$State;
        int i3 = badgeState$State.a;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = vj8.d(context, attributeSetAsAttributeSet, yt6.Badge, i, styleAttribute == 0 ? i2 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(yt6.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(oq6.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(oq6.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(yt6.Badge_badgeWithTextRadius, -1);
        this.e = typedArrayD.getDimension(yt6.Badge_badgeWidth, resources.getDimension(oq6.m3_badge_size));
        this.g = typedArrayD.getDimension(yt6.Badge_badgeWithTextWidth, resources.getDimension(oq6.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(yt6.Badge_badgeHeight, resources.getDimension(oq6.m3_badge_size));
        this.h = typedArrayD.getDimension(yt6.Badge_badgeWithTextHeight, resources.getDimension(oq6.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(yt6.Badge_offsetAlignmentMode, 1);
        this.l = typedArrayD.getInt(yt6.Badge_badgeFixedEdge, 0);
        BadgeState$State badgeState$State2 = this.b;
        int i4 = badgeState$State.i;
        badgeState$State2.i = i4 == -2 ? 255 : i4;
        int i5 = badgeState$State.k;
        if (i5 != -2) {
            badgeState$State2.k = i5;
        } else if (typedArrayD.hasValue(yt6.Badge_number)) {
            this.b.k = typedArrayD.getInt(yt6.Badge_number, 0);
        } else {
            this.b.k = -1;
        }
        String str = badgeState$State.j;
        if (str != null) {
            this.b.j = str;
        } else if (typedArrayD.hasValue(yt6.Badge_badgeText)) {
            this.b.j = typedArrayD.getString(yt6.Badge_badgeText);
        }
        BadgeState$State badgeState$State3 = this.b;
        badgeState$State3.o = badgeState$State.o;
        CharSequence charSequence = badgeState$State.p;
        badgeState$State3.p = charSequence == null ? context.getString(ft6.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State4 = this.b;
        int i6 = badgeState$State.q;
        badgeState$State4.q = i6 == 0 ? os6.mtrl_badge_content_description : i6;
        int i7 = badgeState$State.r;
        badgeState$State4.r = i7 == 0 ? ft6.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = badgeState$State.t;
        badgeState$State4.t = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State5 = this.b;
        int i8 = badgeState$State.l;
        badgeState$State5.l = i8 == -2 ? typedArrayD.getInt(yt6.Badge_maxCharacterCount, -2) : i8;
        BadgeState$State badgeState$State6 = this.b;
        int i9 = badgeState$State.m;
        badgeState$State6.m = i9 == -2 ? typedArrayD.getInt(yt6.Badge_maxNumber, -2) : i9;
        BadgeState$State badgeState$State7 = this.b;
        Integer num = badgeState$State.e;
        badgeState$State7.e = Integer.valueOf(num == null ? typedArrayD.getResourceId(yt6.Badge_badgeShapeAppearance, mt6.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State8 = this.b;
        Integer num2 = badgeState$State.f;
        badgeState$State8.f = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(yt6.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        BadgeState$State badgeState$State9 = this.b;
        Integer num3 = badgeState$State.g;
        badgeState$State9.g = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(yt6.Badge_badgeWithTextShapeAppearance, mt6.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State10 = this.b;
        Integer num4 = badgeState$State.h;
        badgeState$State10.h = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(yt6.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        BadgeState$State badgeState$State11 = this.b;
        Integer num5 = badgeState$State.b;
        badgeState$State11.b = Integer.valueOf(num5 == null ? ja1.r(context, typedArrayD, yt6.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State12 = this.b;
        Integer num6 = badgeState$State.d;
        badgeState$State12.d = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(yt6.Badge_badgeTextAppearance, mt6.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.c;
        if (num7 != null) {
            this.b.c = num7;
        } else if (typedArrayD.hasValue(yt6.Badge_badgeTextColor)) {
            this.b.c = Integer.valueOf(ja1.r(context, typedArrayD, yt6.Badge_badgeTextColor).getDefaultColor());
        } else {
            int iIntValue = this.b.d.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, lu6.TextAppearance);
            typedArrayObtainStyledAttributes.getDimension(lu6.TextAppearance_android_textSize, 0.0f);
            ColorStateList colorStateListR = ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColor);
            ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColorHint);
            ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColorLink);
            typedArrayObtainStyledAttributes.getInt(lu6.TextAppearance_android_textStyle, 0);
            typedArrayObtainStyledAttributes.getInt(lu6.TextAppearance_android_typeface, 1);
            int i10 = lu6.TextAppearance_fontFamily;
            i10 = typedArrayObtainStyledAttributes.hasValue(i10) ? i10 : lu6.TextAppearance_android_fontFamily;
            typedArrayObtainStyledAttributes.getResourceId(i10, 0);
            typedArrayObtainStyledAttributes.getString(i10);
            typedArrayObtainStyledAttributes.getBoolean(lu6.TextAppearance_textAllCaps, false);
            ja1.r(context, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_shadowColor);
            typedArrayObtainStyledAttributes.getFloat(lu6.TextAppearance_android_shadowDx, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(lu6.TextAppearance_android_shadowDy, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(lu6.TextAppearance_android_shadowRadius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, yt6.MaterialTextAppearance);
            typedArrayObtainStyledAttributes2.hasValue(yt6.MaterialTextAppearance_android_letterSpacing);
            typedArrayObtainStyledAttributes2.getFloat(yt6.MaterialTextAppearance_android_letterSpacing, 0.0f);
            if (Build.VERSION.SDK_INT >= 26) {
                int i11 = yt6.MaterialTextAppearance_fontVariationSettings;
                typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i11) ? i11 : yt6.MaterialTextAppearance_android_fontVariationSettings);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.b.c = Integer.valueOf(colorStateListR.getDefaultColor());
        }
        BadgeState$State badgeState$State13 = this.b;
        Integer num8 = badgeState$State.s;
        badgeState$State13.s = Integer.valueOf(num8 == null ? typedArrayD.getInt(yt6.Badge_badgeGravity, 8388661) : num8.intValue());
        BadgeState$State badgeState$State14 = this.b;
        Integer num9 = badgeState$State.u;
        badgeState$State14.u = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(yt6.Badge_badgeWidePadding, resources.getDimensionPixelSize(oq6.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State15 = this.b;
        Integer num10 = badgeState$State.v;
        badgeState$State15.v = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(yt6.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(oq6.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State16 = this.b;
        Integer num11 = badgeState$State.w;
        badgeState$State16.w = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(yt6.Badge_horizontalOffset, 0) : num11.intValue());
        BadgeState$State badgeState$State17 = this.b;
        Integer num12 = badgeState$State.x;
        badgeState$State17.x = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(yt6.Badge_verticalOffset, 0) : num12.intValue());
        BadgeState$State badgeState$State18 = this.b;
        Integer num13 = badgeState$State.y;
        badgeState$State18.y = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(yt6.Badge_horizontalOffsetWithText, badgeState$State18.w.intValue()) : num13.intValue());
        BadgeState$State badgeState$State19 = this.b;
        Integer num14 = badgeState$State.z;
        badgeState$State19.z = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(yt6.Badge_verticalOffsetWithText, badgeState$State19.x.intValue()) : num14.intValue());
        BadgeState$State badgeState$State20 = this.b;
        Integer num15 = badgeState$State.C;
        badgeState$State20.C = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(yt6.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        BadgeState$State badgeState$State21 = this.b;
        Integer num16 = badgeState$State.A;
        badgeState$State21.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State22 = this.b;
        Integer num17 = badgeState$State.B;
        badgeState$State22.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State23 = this.b;
        Boolean bool2 = badgeState$State.D;
        badgeState$State23.D = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(yt6.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = badgeState$State.n;
        if (locale == null) {
            this.b.n = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.b.n = locale;
        }
        this.a = badgeState$State;
    }
}
