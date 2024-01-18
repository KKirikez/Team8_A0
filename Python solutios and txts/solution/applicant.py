class Applicant:

  def __init__(self, first_name, last_name, age, marital_status, speak_1, listen_1, read_1, write_1, all_2, education, work_experience, arranged_employment,
               adaptability_spouse_language, adaptability_spouse_education, adaptability_spouse_work, 
               adaptability_you_education, adaptability_you_work, adaptability_you_employment, adaptability_relatives):
    """_summary_

    Args:
      name (_type_): _description_
      age (_type_): _description_
    """
    self.first_name = first_name
    self.last_name = last_name
    self.age = age
    self.marital_status = marital_status

    self.speak_1 = speak_1
    self.listen_1 = listen_1
    self.read_1 = read_1
    self.write_1 = write_1
    self.all_2 = all_2

    self.education = education 	
    self.work_experience = work_experience
    self.arranged_employment = arranged_employment

    self.adaptability_spouse_language = adaptability_spouse_language
    self.adaptability_spouse_education = adaptability_spouse_education
    self.adaptability_spouse_work = adaptability_spouse_work
    self.adaptability_you_education = adaptability_you_education
    self.adaptability_you_work = adaptability_you_work
    self.adaptability_you_employment = adaptability_you_employment
    self.adaptability_relatives = adaptability_relatives

    self.score = 0

  def __str__(self):
    """_summary_
    """
    return f"{self.first_name:20} {self.last_name:20} {self.age:5} {self.score:5}"


  def __repr__(self):
    """_summary_
    """
    return f"{self.first_name:20} {self.last_name:20} {self.age:5} {self.score:5}"