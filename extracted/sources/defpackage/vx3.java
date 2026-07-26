package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.t0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes.dex */
public final class vx3 extends rx3 {
    public int e = -1;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;

    public vx3() {
        this.d = new HashMap();
    }

    @Override // defpackage.rx3
    public final void a(HashMap map) {
        for (String str : map.keySet()) {
            f99 f99Var = (f99) map.get(str);
            if (f99Var != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.i);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.j);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.p);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.q);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.r)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.s)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.s);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.n);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.o);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.k);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.l);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.h);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.g);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.m);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f)) {
                                break;
                            } else {
                                f99Var.b(this.a, this.f);
                                break;
                            }
                            break;
                    }
                } else {
                    w21 w21Var = (w21) this.d.get(str.substring(7));
                    if (w21Var != null) {
                        ((c99) f99Var).f.append(this.a, w21Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.rx3
    /* JADX INFO: renamed from: b */
    public final rx3 clone() {
        vx3 vx3Var = new vx3();
        super.c(this);
        vx3Var.e = this.e;
        vx3Var.f = this.f;
        vx3Var.g = this.g;
        vx3Var.h = this.h;
        vx3Var.i = this.i;
        vx3Var.j = this.j;
        vx3Var.k = this.k;
        vx3Var.l = this.l;
        vx3Var.m = this.m;
        vx3Var.n = this.n;
        vx3Var.o = this.o;
        vx3Var.p = this.p;
        vx3Var.q = this.q;
        vx3Var.r = this.r;
        vx3Var.s = this.s;
        return vx3Var;
    }

    @Override // defpackage.rx3
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("progress");
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // defpackage.rx3
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.KeyAttribute);
        SparseIntArray sparseIntArray = ux3.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = ux3.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 3:
                case 11:
                default:
                    t0.d("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 5:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 6:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 8:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.c1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 12:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 15:
                    this.p = typedArrayObtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 16:
                    this.q = typedArrayObtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 17:
                    this.r = typedArrayObtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 18:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 19:
                    this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 20:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
            }
        }
    }

    @Override // defpackage.rx3
    public final void f(HashMap map) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            map.put("alpha", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.g)) {
            map.put("elevation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.h)) {
            map.put("rotation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.i)) {
            map.put("rotationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            map.put("transformPivotX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("transformPivotY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            map.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            map.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.r)) {
            map.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            map.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.s)) {
            map.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                map.put(dw1.n("CUSTOM,", (String) it.next()), Integer.valueOf(this.e));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h(Object obj, String str) {
        byte b = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b = 6;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 7;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 8;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    b = 9;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    b = 10;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b = 12;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b = Dot11LinkAdaptationControl.ASELI;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b = 15;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = 16;
                }
                break;
        }
        switch (b) {
            case 0:
                this.s = rx3.g((Number) obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.i = rx3.g((Number) obj);
                break;
            case 3:
                this.j = rx3.g((Number) obj);
                break;
            case 4:
                this.p = rx3.g((Number) obj);
                break;
            case 5:
                this.q = rx3.g((Number) obj);
                break;
            case 6:
                this.r = rx3.g((Number) obj);
                break;
            case 7:
                this.n = rx3.g((Number) obj);
                break;
            case 8:
                this.o = rx3.g((Number) obj);
                break;
            case 9:
                this.k = rx3.g((Number) obj);
                break;
            case 10:
                this.l = rx3.g((Number) obj);
                break;
            case 11:
                this.h = rx3.g((Number) obj);
                break;
            case 12:
                this.g = rx3.g((Number) obj);
                break;
            case 13:
                this.m = rx3.g((Number) obj);
                break;
            case 14:
                this.f = rx3.g((Number) obj);
                break;
            case 15:
                Number number = (Number) obj;
                this.e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case 16:
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                }
                break;
        }
    }
}
