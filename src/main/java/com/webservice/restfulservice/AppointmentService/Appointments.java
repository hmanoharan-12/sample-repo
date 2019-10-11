package com.webservice.restfulservice.AppointmentService;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointments {

		@Id
		private int appointmentid;
		private String uemail;
		private String semail;
		private Date date;
		private String worktype;
		private int contact;
		public int getContact() {
			return contact;
		}
		public void setContact(int contact) {
			this.contact = contact;
		}
		public String getUemail() {
			return uemail;
		}
		public void setUemail(String uemail) {
			this.uemail = uemail;
		}
		public String getSemail() {
			return semail;
		}
		public void setSemail(String semail) {
			this.semail = semail;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int getAppointmentid() {
			return appointmentid;
		}
		public void setAppointmentid(int appointmentid) {
			this.appointmentid = appointmentid;
		}
		public String getWorktype() {
			return worktype;
		}
		public void setWorktype(String worktype) {
			this.worktype = worktype;
		}
		@Override
		public String toString() {
			return "Appointments [appointmentid=" + appointmentid + ", uemail=" + uemail + ", semail=" + semail
					+ ", date=" + date + ", worktype=" + worktype + ", contact=" + contact + "]";
		}
}
