package ir.mservices.market.social.welcome;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.o40;
import defpackage.r50;
import ir.mservices.market.myAccount.dialog.Gender;

/* JADX INFO: loaded from: classes3.dex */
public interface WelcomeAction extends r50 {

    public static final class ChangeDateAction implements WelcomeAction {
        private final String date;

        public ChangeDateAction(String str) {
            js3.p(str, "date");
            this.date = str;
        }

        public static /* synthetic */ ChangeDateAction copy$default(ChangeDateAction changeDateAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = changeDateAction.date;
            }
            return changeDateAction.copy(str);
        }

        public final String component1() {
            return this.date;
        }

        public final ChangeDateAction copy(String str) {
            js3.p(str, "date");
            return new ChangeDateAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeDateAction) && js3.i(this.date, ((ChangeDateAction) obj).date);
        }

        public final String getDate() {
            return this.date;
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return o40.y("ChangeDateAction(date=", this.date, ")");
        }
    }

    public static final class ChangeGenderAction implements WelcomeAction {
        private final Gender gender;

        public ChangeGenderAction(Gender gender) {
            js3.p(gender, "gender");
            this.gender = gender;
        }

        public static /* synthetic */ ChangeGenderAction copy$default(ChangeGenderAction changeGenderAction, Gender gender, int i, Object obj) {
            if ((i & 1) != 0) {
                gender = changeGenderAction.gender;
            }
            return changeGenderAction.copy(gender);
        }

        public final Gender component1() {
            return this.gender;
        }

        public final ChangeGenderAction copy(Gender gender) {
            js3.p(gender, "gender");
            return new ChangeGenderAction(gender);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeGenderAction) && this.gender == ((ChangeGenderAction) obj).gender;
        }

        public final Gender getGender() {
            return this.gender;
        }

        public int hashCode() {
            return this.gender.hashCode();
        }

        public String toString() {
            return "ChangeGenderAction(gender=" + this.gender + ")";
        }
    }

    public static final class ChangeNameAction implements WelcomeAction {
        private final String name;

        public ChangeNameAction(String str) {
            js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.name = str;
        }

        public static /* synthetic */ ChangeNameAction copy$default(ChangeNameAction changeNameAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = changeNameAction.name;
            }
            return changeNameAction.copy(str);
        }

        public final String component1() {
            return this.name;
        }

        public final ChangeNameAction copy(String str) {
            js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return new ChangeNameAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeNameAction) && js3.i(this.name, ((ChangeNameAction) obj).name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return o40.y("ChangeNameAction(name=", this.name, ")");
        }
    }

    public static final class DeleteAvatarAction implements WelcomeAction {
        public static final DeleteAvatarAction INSTANCE = new DeleteAvatarAction();

        private DeleteAvatarAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteAvatarAction);
        }

        public int hashCode() {
            return 1383645779;
        }

        public String toString() {
            return "DeleteAvatarAction";
        }
    }

    public static final class SkipStepAcion implements WelcomeAction {
        public static final SkipStepAcion INSTANCE = new SkipStepAcion();

        private SkipStepAcion() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipStepAcion);
        }

        public int hashCode() {
            return -1306334526;
        }

        public String toString() {
            return "SkipStepAcion";
        }
    }

    public static final class SubmitStepAction implements WelcomeAction {
        public static final SubmitStepAction INSTANCE = new SubmitStepAction();

        private SubmitStepAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitStepAction);
        }

        public int hashCode() {
            return 1257129139;
        }

        public String toString() {
            return "SubmitStepAction";
        }
    }

    public static final class ToastAction implements WelcomeAction {
        private final String message;

        public ToastAction(String str) {
            this.message = str;
        }

        public static /* synthetic */ ToastAction copy$default(ToastAction toastAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toastAction.message;
            }
            return toastAction.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ToastAction copy(String str) {
            return new ToastAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToastAction) && js3.i(this.message, ((ToastAction) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return o40.y("ToastAction(message=", this.message, ")");
        }
    }
}
