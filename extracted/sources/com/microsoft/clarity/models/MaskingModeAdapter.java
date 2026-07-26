package com.microsoft.clarity.models;

import defpackage.js3;
import defpackage.yd1;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class MaskingModeAdapter {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MaskingMode.values().length];
                try {
                    iArr[MaskingMode.Strict.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MaskingMode.Balanced.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MaskingMode.Relaxed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final MaskingMode fromJson(int i) {
            return i == BackEndMaskingMode.Balanced.ordinal() ? MaskingMode.Balanced : i == BackEndMaskingMode.Strict.ordinal() ? MaskingMode.Strict : i == BackEndMaskingMode.Relaxed.ordinal() ? MaskingMode.Relaxed : MaskingMode.Strict;
        }

        public final int toJson(MaskingMode maskingMode) {
            js3.p(maskingMode, "maskingMode");
            int i = WhenMappings.$EnumSwitchMapping$0[maskingMode.ordinal()];
            if (i == 1) {
                return BackEndMaskingMode.Strict.ordinal();
            }
            if (i == 2) {
                return BackEndMaskingMode.Balanced.ordinal();
            }
            if (i == 3) {
                return BackEndMaskingMode.Relaxed.ordinal();
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }
}
