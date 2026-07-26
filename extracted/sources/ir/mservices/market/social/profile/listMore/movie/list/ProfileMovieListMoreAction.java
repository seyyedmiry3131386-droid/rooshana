package ir.mservices.market.social.profile.listMore.movie.list;

import defpackage.js3;
import defpackage.o40;
import defpackage.r50;
import ir.mservices.market.social.profile.list.data.ReportListType;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;

/* JADX INFO: loaded from: classes3.dex */
public interface ProfileMovieListMoreAction extends r50 {

    public static final class ClearAllAction implements ProfileMovieListMoreAction {
        public static final ClearAllAction INSTANCE = new ClearAllAction();

        private ClearAllAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearAllAction);
        }

        public int hashCode() {
            return -619030347;
        }

        public String toString() {
            return "ClearAllAction";
        }
    }

    public static final class DeleteListAction implements ProfileMovieListMoreAction {
        public static final DeleteListAction INSTANCE = new DeleteListAction();

        private DeleteListAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteListAction);
        }

        public int hashCode() {
            return 17944330;
        }

        public String toString() {
            return "DeleteListAction";
        }
    }

    public static final class EditListAction implements ProfileMovieListMoreAction {
        private final SocialListPolicies policies;

        public EditListAction(SocialListPolicies socialListPolicies) {
            this.policies = socialListPolicies;
        }

        public static /* synthetic */ EditListAction copy$default(EditListAction editListAction, SocialListPolicies socialListPolicies, int i, Object obj) {
            if ((i & 1) != 0) {
                socialListPolicies = editListAction.policies;
            }
            return editListAction.copy(socialListPolicies);
        }

        public final SocialListPolicies component1() {
            return this.policies;
        }

        public final EditListAction copy(SocialListPolicies socialListPolicies) {
            return new EditListAction(socialListPolicies);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditListAction) && js3.i(this.policies, ((EditListAction) obj).policies);
        }

        public final SocialListPolicies getPolicies() {
            return this.policies;
        }

        public int hashCode() {
            SocialListPolicies socialListPolicies = this.policies;
            if (socialListPolicies == null) {
                return 0;
            }
            return socialListPolicies.hashCode();
        }

        public String toString() {
            return "EditListAction(policies=" + this.policies + ")";
        }
    }

    public static final class GetMoviePoliciesAction implements ProfileMovieListMoreAction {
        public static final GetMoviePoliciesAction INSTANCE = new GetMoviePoliciesAction();

        private GetMoviePoliciesAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GetMoviePoliciesAction);
        }

        public int hashCode() {
            return 304019979;
        }

        public String toString() {
            return "GetMoviePoliciesAction";
        }
    }

    public static final class ReportListAction implements ProfileMovieListMoreAction {
        private final String listType;
        private final ReportListType type;

        public ReportListAction(String str, ReportListType reportListType) {
            js3.p(str, "listType");
            js3.p(reportListType, "type");
            this.listType = str;
            this.type = reportListType;
        }

        public static /* synthetic */ ReportListAction copy$default(ReportListAction reportListAction, String str, ReportListType reportListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reportListAction.listType;
            }
            if ((i & 2) != 0) {
                reportListType = reportListAction.type;
            }
            return reportListAction.copy(str, reportListType);
        }

        public final String component1() {
            return this.listType;
        }

        public final ReportListType component2() {
            return this.type;
        }

        public final ReportListAction copy(String str, ReportListType reportListType) {
            js3.p(str, "listType");
            js3.p(reportListType, "type");
            return new ReportListAction(str, reportListType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportListAction)) {
                return false;
            }
            ReportListAction reportListAction = (ReportListAction) obj;
            return js3.i(this.listType, reportListAction.listType) && this.type == reportListAction.type;
        }

        public final String getListType() {
            return this.listType;
        }

        public final ReportListType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.listType.hashCode() * 31);
        }

        public String toString() {
            return "ReportListAction(listType=" + this.listType + ", type=" + this.type + ")";
        }
    }

    public static final class ToastAction implements ProfileMovieListMoreAction {
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
