package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.a31;
import defpackage.b31;
import defpackage.c31;
import defpackage.d31;
import defpackage.e31;
import defpackage.eu6;
import defpackage.o40;
import defpackage.qu7;
import defpackage.t61;
import defpackage.vy2;
import defpackage.w21;
import defpackage.wr6;
import defpackage.yy1;
import io.sentry.android.core.t0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;
    public String a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap e = new HashMap();
    public boolean f = true;
    public final HashMap g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(eu6.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(eu6.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(eu6.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(eu6.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(eu6.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(eu6.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(eu6.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(eu6.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(eu6.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(eu6.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(eu6.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(eu6.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(eu6.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(eu6.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(eu6.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(eu6.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(eu6.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(eu6.Constraint_android_orientation, 27);
        sparseIntArray.append(eu6.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(eu6.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(eu6.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(eu6.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(eu6.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(eu6.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(eu6.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(eu6.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(eu6.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(eu6.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(eu6.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(eu6.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(eu6.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(eu6.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(eu6.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(eu6.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(eu6.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(eu6.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(eu6.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(eu6.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(eu6.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(eu6.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(eu6.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(eu6.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(eu6.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(eu6.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(eu6.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(eu6.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(eu6.Constraint_android_layout_width, 23);
        sparseIntArray.append(eu6.Constraint_android_layout_height, 21);
        sparseIntArray.append(eu6.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(eu6.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(eu6.Constraint_android_visibility, 22);
        sparseIntArray.append(eu6.Constraint_android_alpha, 43);
        sparseIntArray.append(eu6.Constraint_android_elevation, 44);
        sparseIntArray.append(eu6.Constraint_android_rotationX, 45);
        sparseIntArray.append(eu6.Constraint_android_rotationY, 46);
        sparseIntArray.append(eu6.Constraint_android_rotation, 60);
        sparseIntArray.append(eu6.Constraint_android_scaleX, 47);
        sparseIntArray.append(eu6.Constraint_android_scaleY, 48);
        sparseIntArray.append(eu6.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(eu6.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(eu6.Constraint_android_translationX, 51);
        sparseIntArray.append(eu6.Constraint_android_translationY, 52);
        sparseIntArray.append(eu6.Constraint_android_translationZ, 53);
        sparseIntArray.append(eu6.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(eu6.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(eu6.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(eu6.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(eu6.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(eu6.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(eu6.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(eu6.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(eu6.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(eu6.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(eu6.Constraint_transitionEasing, 65);
        sparseIntArray.append(eu6.Constraint_drawPath, 66);
        sparseIntArray.append(eu6.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(eu6.Constraint_motionStagger, 79);
        sparseIntArray.append(eu6.Constraint_android_id, 38);
        sparseIntArray.append(eu6.Constraint_motionProgress, 68);
        sparseIntArray.append(eu6.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(eu6.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(eu6.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(eu6.Constraint_chainUseRtl, 71);
        sparseIntArray.append(eu6.Constraint_barrierDirection, 72);
        sparseIntArray.append(eu6.Constraint_barrierMargin, 73);
        sparseIntArray.append(eu6.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(eu6.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(eu6.Constraint_pathMotionArc, 76);
        sparseIntArray.append(eu6.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(eu6.Constraint_visibilityMode, 78);
        sparseIntArray.append(eu6.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(eu6.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(eu6.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(eu6.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(eu6.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(eu6.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(eu6.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(eu6.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(eu6.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(eu6.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(eu6.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(eu6.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(eu6.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(eu6.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(eu6.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(eu6.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(eu6.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(eu6.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(eu6.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(eu6.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(eu6.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(eu6.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(eu6.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(eu6.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(eu6.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(eu6.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(eu6.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(eu6.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(eu6.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(eu6.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(eu6.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(eu6.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(eu6.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(eu6.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(eu6.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(eu6.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(eu6.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(eu6.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(eu6.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(eu6.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(eu6.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(eu6.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(eu6.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static c d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        c cVar = new c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, eu6.ConstraintOverride);
        r(cVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public static int[] i(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = wr6.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (o40.O(strTrim)) {
                    HashMap map = constraintLayout.m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static c j(Context context, AttributeSet attributeSet, boolean z) {
        c cVar = new c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? eu6.ConstraintOverride : eu6.Constraint);
        if (z) {
            r(cVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                b31 b31Var = cVar.e;
                if (i2 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    int i3 = eu6.Constraint_android_id;
                    d31 d31Var = cVar.c;
                    e31 e31Var = cVar.f;
                    c31 c31Var = cVar.d;
                    if (index != i3 && eu6.Constraint_android_layout_marginStart != index && eu6.Constraint_android_layout_marginEnd != index) {
                        c31Var.a = true;
                        b31Var.b = true;
                        d31Var.a = true;
                        e31Var.a = true;
                    }
                    SparseIntArray sparseIntArray = i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            b31Var.q = o(typedArrayObtainStyledAttributes, index, b31Var.q);
                            break;
                        case 2:
                            b31Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.J);
                            break;
                        case 3:
                            b31Var.p = o(typedArrayObtainStyledAttributes, index, b31Var.p);
                            break;
                        case 4:
                            b31Var.o = o(typedArrayObtainStyledAttributes, index, b31Var.o);
                            break;
                        case 5:
                            b31Var.z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            b31Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b31Var.D);
                            break;
                        case 7:
                            b31Var.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b31Var.E);
                            break;
                        case 8:
                            b31Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.K);
                            break;
                        case 9:
                            b31Var.w = o(typedArrayObtainStyledAttributes, index, b31Var.w);
                            break;
                        case 10:
                            b31Var.v = o(typedArrayObtainStyledAttributes, index, b31Var.v);
                            break;
                        case 11:
                            b31Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.Q);
                            break;
                        case 12:
                            b31Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.R);
                            break;
                        case 13:
                            b31Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.N);
                            break;
                        case 14:
                            b31Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.P);
                            break;
                        case 15:
                            b31Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.S);
                            break;
                        case 16:
                            b31Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.O);
                            break;
                        case 17:
                            b31Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b31Var.e);
                            break;
                        case 18:
                            b31Var.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, b31Var.f);
                            break;
                        case 19:
                            b31Var.g = typedArrayObtainStyledAttributes.getFloat(index, b31Var.g);
                            break;
                        case 20:
                            b31Var.x = typedArrayObtainStyledAttributes.getFloat(index, b31Var.x);
                            break;
                        case 21:
                            b31Var.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, b31Var.d);
                            break;
                        case 22:
                            int i4 = typedArrayObtainStyledAttributes.getInt(index, d31Var.b);
                            d31Var.b = i4;
                            d31Var.b = h[i4];
                            break;
                        case 23:
                            b31Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, b31Var.c);
                            break;
                        case 24:
                            b31Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.G);
                            break;
                        case 25:
                            b31Var.i = o(typedArrayObtainStyledAttributes, index, b31Var.i);
                            break;
                        case 26:
                            b31Var.j = o(typedArrayObtainStyledAttributes, index, b31Var.j);
                            break;
                        case 27:
                            b31Var.F = typedArrayObtainStyledAttributes.getInt(index, b31Var.F);
                            break;
                        case 28:
                            b31Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.H);
                            break;
                        case 29:
                            b31Var.k = o(typedArrayObtainStyledAttributes, index, b31Var.k);
                            break;
                        case 30:
                            b31Var.l = o(typedArrayObtainStyledAttributes, index, b31Var.l);
                            break;
                        case 31:
                            b31Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.L);
                            break;
                        case 32:
                            b31Var.t = o(typedArrayObtainStyledAttributes, index, b31Var.t);
                            break;
                        case 33:
                            b31Var.u = o(typedArrayObtainStyledAttributes, index, b31Var.u);
                            break;
                        case 34:
                            b31Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.I);
                            break;
                        case 35:
                            b31Var.n = o(typedArrayObtainStyledAttributes, index, b31Var.n);
                            break;
                        case 36:
                            b31Var.m = o(typedArrayObtainStyledAttributes, index, b31Var.m);
                            break;
                        case 37:
                            b31Var.y = typedArrayObtainStyledAttributes.getFloat(index, b31Var.y);
                            break;
                        case 38:
                            cVar.a = typedArrayObtainStyledAttributes.getResourceId(index, cVar.a);
                            break;
                        case 39:
                            b31Var.V = typedArrayObtainStyledAttributes.getFloat(index, b31Var.V);
                            break;
                        case 40:
                            b31Var.U = typedArrayObtainStyledAttributes.getFloat(index, b31Var.U);
                            break;
                        case 41:
                            b31Var.W = typedArrayObtainStyledAttributes.getInt(index, b31Var.W);
                            break;
                        case 42:
                            b31Var.X = typedArrayObtainStyledAttributes.getInt(index, b31Var.X);
                            break;
                        case 43:
                            d31Var.d = typedArrayObtainStyledAttributes.getFloat(index, d31Var.d);
                            break;
                        case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                            e31Var.m = true;
                            e31Var.n = typedArrayObtainStyledAttributes.getDimension(index, e31Var.n);
                            break;
                        case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                            e31Var.c = typedArrayObtainStyledAttributes.getFloat(index, e31Var.c);
                            break;
                        case 46:
                            e31Var.d = typedArrayObtainStyledAttributes.getFloat(index, e31Var.d);
                            break;
                        case 47:
                            e31Var.e = typedArrayObtainStyledAttributes.getFloat(index, e31Var.e);
                            break;
                        case 48:
                            e31Var.f = typedArrayObtainStyledAttributes.getFloat(index, e31Var.f);
                            break;
                        case 49:
                            e31Var.g = typedArrayObtainStyledAttributes.getDimension(index, e31Var.g);
                            break;
                        case 50:
                            e31Var.h = typedArrayObtainStyledAttributes.getDimension(index, e31Var.h);
                            break;
                        case 51:
                            e31Var.j = typedArrayObtainStyledAttributes.getDimension(index, e31Var.j);
                            break;
                        case 52:
                            e31Var.k = typedArrayObtainStyledAttributes.getDimension(index, e31Var.k);
                            break;
                        case 53:
                            e31Var.l = typedArrayObtainStyledAttributes.getDimension(index, e31Var.l);
                            break;
                        case 54:
                            b31Var.Y = typedArrayObtainStyledAttributes.getInt(index, b31Var.Y);
                            break;
                        case 55:
                            b31Var.Z = typedArrayObtainStyledAttributes.getInt(index, b31Var.Z);
                            break;
                        case 56:
                            b31Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.a0);
                            break;
                        case 57:
                            b31Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.b0);
                            break;
                        case 58:
                            b31Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.c0);
                            break;
                        case 59:
                            b31Var.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.d0);
                            break;
                        case 60:
                            e31Var.b = typedArrayObtainStyledAttributes.getFloat(index, e31Var.b);
                            break;
                        case 61:
                            b31Var.A = o(typedArrayObtainStyledAttributes, index, b31Var.A);
                            break;
                        case 62:
                            b31Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.B);
                            break;
                        case 63:
                            b31Var.C = typedArrayObtainStyledAttributes.getFloat(index, b31Var.C);
                            break;
                        case 64:
                            c31Var.b = o(typedArrayObtainStyledAttributes, index, c31Var.b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                c31Var.d = yy1.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                c31Var.d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            c31Var.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            c31Var.h = typedArrayObtainStyledAttributes.getFloat(index, c31Var.h);
                            break;
                        case 68:
                            d31Var.e = typedArrayObtainStyledAttributes.getFloat(index, d31Var.e);
                            break;
                        case 69:
                            b31Var.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            b31Var.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            t0.d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            b31Var.g0 = typedArrayObtainStyledAttributes.getInt(index, b31Var.g0);
                            break;
                        case 73:
                            b31Var.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.h0);
                            break;
                        case 74:
                            b31Var.k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            b31Var.o0 = typedArrayObtainStyledAttributes.getBoolean(index, b31Var.o0);
                            break;
                        case 76:
                            c31Var.e = typedArrayObtainStyledAttributes.getInt(index, c31Var.e);
                            break;
                        case 77:
                            b31Var.l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            d31Var.c = typedArrayObtainStyledAttributes.getInt(index, d31Var.c);
                            break;
                        case 79:
                            c31Var.g = typedArrayObtainStyledAttributes.getFloat(index, c31Var.g);
                            break;
                        case 80:
                            b31Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index, b31Var.m0);
                            break;
                        case 81:
                            b31Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index, b31Var.n0);
                            break;
                        case 82:
                            c31Var.c = typedArrayObtainStyledAttributes.getInteger(index, c31Var.c);
                            break;
                        case 83:
                            e31Var.i = o(typedArrayObtainStyledAttributes, index, e31Var.i);
                            break;
                        case 84:
                            c31Var.j = typedArrayObtainStyledAttributes.getInteger(index, c31Var.j);
                            break;
                        case 85:
                            c31Var.i = typedArrayObtainStyledAttributes.getFloat(index, c31Var.i);
                            break;
                        case 86:
                            int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i5 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c31Var.m = resourceId;
                                if (resourceId != -1) {
                                    c31Var.l = -2;
                                }
                            } else if (i5 != 3) {
                                c31Var.l = typedArrayObtainStyledAttributes.getInteger(index, c31Var.m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                c31Var.k = string;
                                if (string.indexOf("/") <= 0) {
                                    c31Var.l = -1;
                                } else {
                                    c31Var.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    c31Var.l = -2;
                                }
                            }
                            break;
                        case 87:
                            t0.m("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            t0.m("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            b31Var.r = o(typedArrayObtainStyledAttributes, index, b31Var.r);
                            break;
                        case 92:
                            b31Var.s = o(typedArrayObtainStyledAttributes, index, b31Var.s);
                            break;
                        case 93:
                            b31Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.M);
                            break;
                        case 94:
                            b31Var.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, b31Var.T);
                            break;
                        case 95:
                            p(b31Var, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            p(b31Var, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            b31Var.p0 = typedArrayObtainStyledAttributes.getInt(index, b31Var.p0);
                            break;
                    }
                    i2++;
                } else if (b31Var.k0 != null) {
                    b31Var.j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public static int o(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.p(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void q(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i2 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.G = str;
    }

    public static void r(c cVar, TypedArray typedArray) {
        char c;
        int indexCount = typedArray.getIndexCount();
        a31 a31Var = new a31();
        a31Var.a = new int[10];
        a31Var.b = new int[10];
        a31Var.c = 0;
        a31Var.d = new int[10];
        a31Var.e = new float[10];
        a31Var.f = 0;
        a31Var.g = new int[5];
        a31Var.h = new String[5];
        a31Var.i = 0;
        a31Var.j = new int[4];
        a31Var.k = new boolean[4];
        a31Var.l = 0;
        cVar.h = a31Var;
        c31 c31Var = cVar.d;
        c31Var.a = false;
        b31 b31Var = cVar.e;
        b31Var.b = false;
        d31 d31Var = cVar.c;
        d31Var.a = false;
        e31 e31Var = cVar.f;
        e31Var.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i3) {
                case 2:
                    c = 5;
                    a31Var.b(2, typedArray.getDimensionPixelSize(index, b31Var.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    t0.m("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 5:
                    c = 5;
                    a31Var.c(5, typedArray.getString(index));
                    break;
                case 6:
                    a31Var.b(6, typedArray.getDimensionPixelOffset(index, b31Var.D));
                    c = 5;
                    break;
                case 7:
                    a31Var.b(7, typedArray.getDimensionPixelOffset(index, b31Var.E));
                    c = 5;
                    break;
                case 8:
                    a31Var.b(8, typedArray.getDimensionPixelSize(index, b31Var.K));
                    c = 5;
                    break;
                case 11:
                    a31Var.b(11, typedArray.getDimensionPixelSize(index, b31Var.Q));
                    c = 5;
                    break;
                case 12:
                    a31Var.b(12, typedArray.getDimensionPixelSize(index, b31Var.R));
                    c = 5;
                    break;
                case 13:
                    a31Var.b(13, typedArray.getDimensionPixelSize(index, b31Var.N));
                    c = 5;
                    break;
                case 14:
                    a31Var.b(14, typedArray.getDimensionPixelSize(index, b31Var.P));
                    c = 5;
                    break;
                case 15:
                    a31Var.b(15, typedArray.getDimensionPixelSize(index, b31Var.S));
                    c = 5;
                    break;
                case 16:
                    a31Var.b(16, typedArray.getDimensionPixelSize(index, b31Var.O));
                    c = 5;
                    break;
                case 17:
                    a31Var.b(17, typedArray.getDimensionPixelOffset(index, b31Var.e));
                    c = 5;
                    break;
                case 18:
                    a31Var.b(18, typedArray.getDimensionPixelOffset(index, b31Var.f));
                    c = 5;
                    break;
                case 19:
                    a31Var.a(19, typedArray.getFloat(index, b31Var.g));
                    c = 5;
                    break;
                case 20:
                    a31Var.a(20, typedArray.getFloat(index, b31Var.x));
                    c = 5;
                    break;
                case 21:
                    a31Var.b(21, typedArray.getLayoutDimension(index, b31Var.d));
                    c = 5;
                    break;
                case 22:
                    a31Var.b(22, h[typedArray.getInt(index, d31Var.b)]);
                    c = 5;
                    break;
                case 23:
                    a31Var.b(23, typedArray.getLayoutDimension(index, b31Var.c));
                    c = 5;
                    break;
                case 24:
                    a31Var.b(24, typedArray.getDimensionPixelSize(index, b31Var.G));
                    c = 5;
                    break;
                case 27:
                    a31Var.b(27, typedArray.getInt(index, b31Var.F));
                    c = 5;
                    break;
                case 28:
                    a31Var.b(28, typedArray.getDimensionPixelSize(index, b31Var.H));
                    c = 5;
                    break;
                case 31:
                    a31Var.b(31, typedArray.getDimensionPixelSize(index, b31Var.L));
                    c = 5;
                    break;
                case 34:
                    a31Var.b(34, typedArray.getDimensionPixelSize(index, b31Var.I));
                    c = 5;
                    break;
                case 37:
                    a31Var.a(37, typedArray.getFloat(index, b31Var.y));
                    c = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, cVar.a);
                    cVar.a = resourceId;
                    a31Var.b(38, resourceId);
                    c = 5;
                    break;
                case 39:
                    a31Var.a(39, typedArray.getFloat(index, b31Var.V));
                    c = 5;
                    break;
                case 40:
                    a31Var.a(40, typedArray.getFloat(index, b31Var.U));
                    c = 5;
                    break;
                case 41:
                    a31Var.b(41, typedArray.getInt(index, b31Var.W));
                    c = 5;
                    break;
                case 42:
                    a31Var.b(42, typedArray.getInt(index, b31Var.X));
                    c = 5;
                    break;
                case 43:
                    a31Var.a(43, typedArray.getFloat(index, d31Var.d));
                    c = 5;
                    break;
                case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                    a31Var.d(44, true);
                    a31Var.a(44, typedArray.getDimension(index, e31Var.n));
                    c = 5;
                    break;
                case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                    a31Var.a(45, typedArray.getFloat(index, e31Var.c));
                    c = 5;
                    break;
                case 46:
                    a31Var.a(46, typedArray.getFloat(index, e31Var.d));
                    c = 5;
                    break;
                case 47:
                    a31Var.a(47, typedArray.getFloat(index, e31Var.e));
                    c = 5;
                    break;
                case 48:
                    a31Var.a(48, typedArray.getFloat(index, e31Var.f));
                    c = 5;
                    break;
                case 49:
                    a31Var.a(49, typedArray.getDimension(index, e31Var.g));
                    c = 5;
                    break;
                case 50:
                    a31Var.a(50, typedArray.getDimension(index, e31Var.h));
                    c = 5;
                    break;
                case 51:
                    a31Var.a(51, typedArray.getDimension(index, e31Var.j));
                    c = 5;
                    break;
                case 52:
                    a31Var.a(52, typedArray.getDimension(index, e31Var.k));
                    c = 5;
                    break;
                case 53:
                    a31Var.a(53, typedArray.getDimension(index, e31Var.l));
                    c = 5;
                    break;
                case 54:
                    a31Var.b(54, typedArray.getInt(index, b31Var.Y));
                    c = 5;
                    break;
                case 55:
                    a31Var.b(55, typedArray.getInt(index, b31Var.Z));
                    c = 5;
                    break;
                case 56:
                    a31Var.b(56, typedArray.getDimensionPixelSize(index, b31Var.a0));
                    c = 5;
                    break;
                case 57:
                    a31Var.b(57, typedArray.getDimensionPixelSize(index, b31Var.b0));
                    c = 5;
                    break;
                case 58:
                    a31Var.b(58, typedArray.getDimensionPixelSize(index, b31Var.c0));
                    c = 5;
                    break;
                case 59:
                    a31Var.b(59, typedArray.getDimensionPixelSize(index, b31Var.d0));
                    c = 5;
                    break;
                case 60:
                    a31Var.a(60, typedArray.getFloat(index, e31Var.b));
                    c = 5;
                    break;
                case 62:
                    a31Var.b(62, typedArray.getDimensionPixelSize(index, b31Var.B));
                    c = 5;
                    break;
                case 63:
                    a31Var.a(63, typedArray.getFloat(index, b31Var.C));
                    c = 5;
                    break;
                case 64:
                    a31Var.b(64, o(typedArray, index, c31Var.b));
                    c = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        a31Var.c(65, typedArray.getString(index));
                    } else {
                        a31Var.c(65, yy1.d[typedArray.getInteger(index, 0)]);
                    }
                    c = 5;
                    break;
                case 66:
                    a31Var.b(66, typedArray.getInt(index, 0));
                    c = 5;
                    break;
                case 67:
                    a31Var.a(67, typedArray.getFloat(index, c31Var.h));
                    c = 5;
                    break;
                case 68:
                    a31Var.a(68, typedArray.getFloat(index, d31Var.e));
                    c = 5;
                    break;
                case 69:
                    a31Var.a(69, typedArray.getFloat(index, 1.0f));
                    c = 5;
                    break;
                case 70:
                    a31Var.a(70, typedArray.getFloat(index, 1.0f));
                    c = 5;
                    break;
                case 71:
                    t0.d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c = 5;
                    break;
                case 72:
                    a31Var.b(72, typedArray.getInt(index, b31Var.g0));
                    c = 5;
                    break;
                case 73:
                    a31Var.b(73, typedArray.getDimensionPixelSize(index, b31Var.h0));
                    c = 5;
                    break;
                case 74:
                    a31Var.c(74, typedArray.getString(index));
                    c = 5;
                    break;
                case 75:
                    a31Var.d(75, typedArray.getBoolean(index, b31Var.o0));
                    c = 5;
                    break;
                case 76:
                    a31Var.b(76, typedArray.getInt(index, c31Var.e));
                    c = 5;
                    break;
                case 77:
                    a31Var.c(77, typedArray.getString(index));
                    c = 5;
                    break;
                case 78:
                    a31Var.b(78, typedArray.getInt(index, d31Var.c));
                    c = 5;
                    break;
                case 79:
                    a31Var.a(79, typedArray.getFloat(index, c31Var.g));
                    c = 5;
                    break;
                case 80:
                    a31Var.d(80, typedArray.getBoolean(index, b31Var.m0));
                    c = 5;
                    break;
                case 81:
                    a31Var.d(81, typedArray.getBoolean(index, b31Var.n0));
                    c = 5;
                    break;
                case 82:
                    a31Var.b(82, typedArray.getInteger(index, c31Var.c));
                    c = 5;
                    break;
                case 83:
                    a31Var.b(83, o(typedArray, index, e31Var.i));
                    c = 5;
                    break;
                case 84:
                    a31Var.b(84, typedArray.getInteger(index, c31Var.j));
                    c = 5;
                    break;
                case 85:
                    a31Var.a(85, typedArray.getFloat(index, c31Var.i));
                    c = 5;
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        c31Var.m = resourceId2;
                        a31Var.b(89, resourceId2);
                        if (c31Var.m != -1) {
                            c31Var.l = -2;
                            a31Var.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        c31Var.k = string;
                        a31Var.c(90, string);
                        if (c31Var.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            c31Var.m = resourceId3;
                            a31Var.b(89, resourceId3);
                            c31Var.l = -2;
                            a31Var.b(88, -2);
                        } else {
                            c31Var.l = -1;
                            a31Var.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, c31Var.m);
                        c31Var.l = integer;
                        a31Var.b(88, integer);
                    }
                    c = 5;
                    break;
                case 87:
                    t0.m("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 93:
                    a31Var.b(93, typedArray.getDimensionPixelSize(index, b31Var.M));
                    c = 5;
                    break;
                case 94:
                    a31Var.b(94, typedArray.getDimensionPixelSize(index, b31Var.T));
                    c = 5;
                    break;
                case 95:
                    p(a31Var, typedArray, index, 0);
                    c = 5;
                    break;
                case 96:
                    p(a31Var, typedArray, index, 1);
                    c = 5;
                    break;
                case 97:
                    a31Var.b(97, typedArray.getInt(index, b31Var.p0));
                    c = 5;
                    break;
                case 98:
                    if (MotionLayout.c1) {
                        int resourceId4 = typedArray.getResourceId(index, cVar.a);
                        cVar.a = resourceId4;
                        if (resourceId4 == -1) {
                            cVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        cVar.b = typedArray.getString(index);
                    } else {
                        cVar.a = typedArray.getResourceId(index, cVar.a);
                    }
                    c = 5;
                    break;
                case 99:
                    a31Var.d(99, typedArray.getBoolean(index, b31Var.h));
                    c = 5;
                    break;
            }
        }
    }

    public static String s(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(MotionLayout motionLayout) {
        c cVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.g;
            if (!map.containsKey(numValueOf)) {
                t0.m("ConstraintSet", "id unknown " + vy2.F(childAt));
            } else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (cVar = (c) map.get(Integer.valueOf(id))) != null) {
                    w21.e(childAt, cVar.g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                t0.m("ConstraintSet", "id unknown " + vy2.F(childAt));
            } else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    c cVar = (c) map.get(Integer.valueOf(id));
                    if (cVar != null) {
                        d31 d31Var = cVar.c;
                        b31 b31Var = cVar.e;
                        e31 e31Var = cVar.f;
                        if (childAt instanceof Barrier) {
                            b31Var.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(b31Var.g0);
                            barrier.setMargin(b31Var.h0);
                            barrier.setAllowsGoneWidget(b31Var.o0);
                            int[] iArr = b31Var.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = b31Var.k0;
                                if (str != null) {
                                    int[] iArrI = i(barrier, str);
                                    b31Var.j0 = iArrI;
                                    barrier.setReferencedIds(iArrI);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.a();
                        cVar.a(layoutParams);
                        w21.e(childAt, cVar.g);
                        childAt.setLayoutParams(layoutParams);
                        if (d31Var.c == 0) {
                            childAt.setVisibility(d31Var.b);
                        }
                        childAt.setAlpha(d31Var.d);
                        childAt.setRotation(e31Var.b);
                        childAt.setRotationX(e31Var.c);
                        childAt.setRotationY(e31Var.d);
                        childAt.setScaleX(e31Var.e);
                        childAt.setScaleY(e31Var.f);
                        if (e31Var.i != -1) {
                            if (((View) childAt.getParent()).findViewById(e31Var.i) != null) {
                                float bottom = (r5.getBottom() + r5.getTop()) / 2.0f;
                                float right = (r5.getRight() + r5.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(e31Var.g)) {
                                childAt.setPivotX(e31Var.g);
                            }
                            if (!Float.isNaN(e31Var.h)) {
                                childAt.setPivotY(e31Var.h);
                            }
                        }
                        childAt.setTranslationX(e31Var.j);
                        childAt.setTranslationY(e31Var.k);
                        childAt.setTranslationZ(e31Var.l);
                        if (e31Var.m) {
                            childAt.setElevation(e31Var.n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            c cVar2 = (c) map.get(num);
            if (cVar2 != null) {
                b31 b31Var2 = cVar2.e;
                if (b31Var2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = b31Var2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = b31Var2.k0;
                        if (str2 != null) {
                            int[] iArrI2 = i(barrier2, str2);
                            b31Var2.j0 = iArrI2;
                            barrier2.setReferencedIds(iArrI2);
                        }
                    }
                    barrier2.setType(b31Var2.g0);
                    barrier2.setMargin(b31Var2.h0);
                    qu7 qu7Var = ConstraintLayout.p;
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                    barrier2.q();
                    cVar2.a(layoutParams2);
                    constraintLayout.addView(barrier2, layoutParams2);
                }
                if (b31Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    qu7 qu7Var2 = ConstraintLayout.p;
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                    cVar2.a(layoutParams3);
                    constraintLayout.addView(guideline, layoutParams3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).g(constraintLayout);
            }
        }
    }

    public final void e(int i2, int i3) {
        c cVar;
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf) || (cVar = (c) map.get(Integer.valueOf(i2))) == null) {
            return;
        }
        b31 b31Var = cVar.e;
        switch (i3) {
            case 1:
                b31Var.j = -1;
                b31Var.i = -1;
                b31Var.G = -1;
                b31Var.N = Integer.MIN_VALUE;
                return;
            case 2:
                b31Var.l = -1;
                b31Var.k = -1;
                b31Var.H = -1;
                b31Var.P = Integer.MIN_VALUE;
                return;
            case 3:
                b31Var.n = -1;
                b31Var.m = -1;
                b31Var.I = 0;
                b31Var.O = Integer.MIN_VALUE;
                return;
            case 4:
                b31Var.o = -1;
                b31Var.p = -1;
                b31Var.J = 0;
                b31Var.Q = Integer.MIN_VALUE;
                return;
            case 5:
                b31Var.q = -1;
                b31Var.r = -1;
                b31Var.s = -1;
                b31Var.M = 0;
                b31Var.T = Integer.MIN_VALUE;
                return;
            case 6:
                b31Var.t = -1;
                b31Var.u = -1;
                b31Var.L = 0;
                b31Var.S = Integer.MIN_VALUE;
                return;
            case 7:
                b31Var.v = -1;
                b31Var.w = -1;
                b31Var.K = 0;
                b31Var.R = Integer.MIN_VALUE;
                return;
            case 8:
                b31Var.C = -1.0f;
                b31Var.B = -1;
                b31Var.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int i2;
        HashMap map;
        int i3;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = dVar.g;
        map2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (dVar.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new c());
            }
            c cVar = (c) map2.get(Integer.valueOf(id));
            if (cVar == null) {
                i2 = childCount;
                map = map2;
                i3 = i4;
            } else {
                d31 d31Var = cVar.c;
                b31 b31Var = cVar.e;
                e31 e31Var = cVar.f;
                i2 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i3 = i4;
                HashMap map4 = dVar.e;
                for (String str : map4.keySet()) {
                    w21 w21Var = (w21) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new w21(w21Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new w21(w21Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbN = t61.n(" Custom Attribute \"", str, "\" not found on ");
                        sbN.append(cls.getName());
                        t0.e("TransitionLayout", sbN.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        t0.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbN2 = t61.n(" Custom Attribute \"", str, "\" not found on ");
                        sbN2.append(cls.getName());
                        t0.e("TransitionLayout", sbN2.toString(), e3);
                    }
                    map4 = map5;
                }
                cVar.g = map3;
                cVar.c(id, layoutParams);
                d31Var.b = childAt.getVisibility();
                d31Var.d = childAt.getAlpha();
                e31Var.b = childAt.getRotation();
                e31Var.c = childAt.getRotationX();
                e31Var.d = childAt.getRotationY();
                e31Var.e = childAt.getScaleX();
                e31Var.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e31Var.g = pivotX;
                    e31Var.h = pivotY;
                }
                e31Var.j = childAt.getTranslationX();
                e31Var.k = childAt.getTranslationY();
                e31Var.l = childAt.getTranslationZ();
                if (e31Var.m) {
                    e31Var.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    b31Var.o0 = barrier.getAllowsGoneWidget();
                    b31Var.j0 = barrier.getReferencedIds();
                    b31Var.g0 = barrier.getType();
                    b31Var.h0 = barrier.getMargin();
                }
            }
            i4 = i3 + 1;
            dVar = this;
            childCount = i2;
            map2 = map;
        }
    }

    public final void g(int i2, int i3, int i4, int i5) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new c());
        }
        c cVar = (c) map.get(Integer.valueOf(i2));
        if (cVar == null) {
            return;
        }
        b31 b31Var = cVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b31Var.i = i4;
                    b31Var.j = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Left to " + s(i5) + " undefined");
                    }
                    b31Var.j = i4;
                    b31Var.i = -1;
                }
                b31Var.G = -1;
                return;
            case 2:
                if (i5 == 1) {
                    b31Var.k = i4;
                    b31Var.l = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                    }
                    b31Var.l = i4;
                    b31Var.k = -1;
                }
                b31Var.H = -1;
                return;
            case 3:
                if (i5 == 3) {
                    b31Var.m = i4;
                    b31Var.n = -1;
                    b31Var.q = -1;
                    b31Var.r = -1;
                    b31Var.s = -1;
                } else {
                    if (i5 != 4) {
                        throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                    }
                    b31Var.n = i4;
                    b31Var.m = -1;
                    b31Var.q = -1;
                    b31Var.r = -1;
                    b31Var.s = -1;
                }
                b31Var.I = -1;
                return;
            case 4:
                if (i5 == 4) {
                    b31Var.p = i4;
                    b31Var.o = -1;
                    b31Var.q = -1;
                    b31Var.r = -1;
                    b31Var.s = -1;
                } else {
                    if (i5 != 3) {
                        throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                    }
                    b31Var.o = i4;
                    b31Var.p = -1;
                    b31Var.q = -1;
                    b31Var.r = -1;
                    b31Var.s = -1;
                }
                b31Var.J = -1;
                return;
            case 5:
                if (i5 == 5) {
                    b31Var.q = i4;
                    b31Var.p = -1;
                    b31Var.o = -1;
                    b31Var.m = -1;
                    b31Var.n = -1;
                    return;
                }
                if (i5 == 3) {
                    b31Var.r = i4;
                    b31Var.p = -1;
                    b31Var.o = -1;
                    b31Var.m = -1;
                    b31Var.n = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
                b31Var.s = i4;
                b31Var.p = -1;
                b31Var.o = -1;
                b31Var.m = -1;
                b31Var.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b31Var.u = i4;
                    b31Var.t = -1;
                } else {
                    if (i5 != 7) {
                        throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                    }
                    b31Var.t = i4;
                    b31Var.u = -1;
                }
                b31Var.L = -1;
                return;
            case 7:
                if (i5 == 7) {
                    b31Var.w = i4;
                    b31Var.v = -1;
                } else {
                    if (i5 != 6) {
                        throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                    }
                    b31Var.v = i4;
                    b31Var.w = -1;
                }
                b31Var.K = -1;
                return;
            default:
                throw new IllegalArgumentException(s(i3) + " to " + s(i5) + " unknown");
        }
    }

    public final void h(int i2, int i3, int i4, int i5) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new c());
        }
        c cVar = (c) map.get(Integer.valueOf(i2));
        if (cVar == null) {
            return;
        }
        b31 b31Var = cVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b31Var.i = i4;
                    b31Var.j = -1;
                    return;
                } else if (i5 == 2) {
                    b31Var.j = i4;
                    b31Var.i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + s(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    b31Var.k = i4;
                    b31Var.l = -1;
                    return;
                } else if (i5 == 2) {
                    b31Var.l = i4;
                    b31Var.k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    b31Var.m = i4;
                    b31Var.n = -1;
                    b31Var.q = -1;
                    b31Var.r = -1;
                    b31Var.s = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
                b31Var.n = i4;
                b31Var.m = -1;
                b31Var.q = -1;
                b31Var.r = -1;
                b31Var.s = -1;
                return;
            case 4:
                if (i5 == 4) {
                    b31Var.p = i4;
                    b31Var.o = -1;
                    b31Var.q = -1;
                    b31Var.r = -1;
                    b31Var.s = -1;
                    return;
                }
                if (i5 != 3) {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
                b31Var.o = i4;
                b31Var.p = -1;
                b31Var.q = -1;
                b31Var.r = -1;
                b31Var.s = -1;
                return;
            case 5:
                if (i5 == 5) {
                    b31Var.q = i4;
                    b31Var.p = -1;
                    b31Var.o = -1;
                    b31Var.m = -1;
                    b31Var.n = -1;
                    return;
                }
                if (i5 == 3) {
                    b31Var.r = i4;
                    b31Var.p = -1;
                    b31Var.o = -1;
                    b31Var.m = -1;
                    b31Var.n = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
                b31Var.s = i4;
                b31Var.p = -1;
                b31Var.o = -1;
                b31Var.m = -1;
                b31Var.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b31Var.u = i4;
                    b31Var.t = -1;
                    return;
                } else if (i5 == 7) {
                    b31Var.t = i4;
                    b31Var.u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    b31Var.w = i4;
                    b31Var.v = -1;
                    return;
                } else if (i5 == 6) {
                    b31Var.v = i4;
                    b31Var.w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + s(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(s(i3) + " to " + s(i5) + " unknown");
        }
    }

    public final c k(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new c());
        }
        return (c) map.get(Integer.valueOf(i2));
    }

    public final c l(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (map.containsKey(numValueOf)) {
            return (c) map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void m(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    c cVarJ = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        cVarJ.e.a = true;
                    }
                    this.g.put(Integer.valueOf(cVarJ.a), cVarJ);
                }
            }
        } catch (IOException e) {
            t0.e("ConstraintSet", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            t0.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01af, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.n(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
