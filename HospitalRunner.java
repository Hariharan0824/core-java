class HospitalRunner{
public static void main(String args[]){
	System.out.println("Hospital");
System.out.println("Length of an Array is:"+Hospital.hospitalNames.length);
for(int i=0;i<Hospital.hospitalNames.length;i++){
	System.out.println(Hospital.hospitalNames[i]);
	}
for(int i=0;i<Hospital.hospitalNames.length;i++){
	System.out.println("No of HospitalNmes is:"+Hospital.hospitalNames[i]);
	}
for(int i=0;i<Hospital.noOfPatients.length;i++){
	System.out.println("No of Patients is:"+Hospital.noOfPatients[i]);
	}
for(int i=0;i<Hospital.noOfBeds.length;i++){
	System.out.println("No of Beds is:"+Hospital.noOfBeds[i]);
	}
for(int i=0;i<Hospital.noOfVisitors.length;i++){
	System.out.println("No of Visitors:"+Hospital.noOfVisitors[i]);
	}
for(int i=0;i<Hospital.hospitalRatings.length;i++){
	System.out.println("No of Hospital Ratings is:"+Hospital.hospitalRatings[i]);
	}
for(int i=0;i<Hospital.cent.length;i++){
	System.out.println("No Of Cent is:"+Hospital.cent[i]);
	}
for(int i=0;i<Hospital.healthCare.length;i++){
	System.out.println("Healthcare of the Patients is:"+Hospital.healthCare[i]);
	}
for(int i=0;i<Hospital.hospitalCertificate.length;i++){
	System.out.println("Hospital Certificate is:"+Hospital.hospitalCertificate[i]);
	}
}
}