package leageoflegendsapp.leagueoflegendsapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Champion {
    
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String description;
    private String skillQ;
    private String skillQDescription;
    private String skillQImageURL;
    private String skillW;
    private String skillWDescription;
    private String skillWImageURL;
    private String skillE;
    private String skillEDescription;
    private String skillEImageURL;
    private String skillR;
    private String skillRDescription;
    private String skillRImageURL;
    private String skillP;
    private String skillPDescription;
    private String skillPImageURL;
    private String imageURL;
    private String linkURL;

    public Champion() {
    }

    public Champion(String name, String description, String skillP, String skillPDescription, String skillPImageURL,String skillQ, String skillQDescription, String skillQImageURL,
            String skillW, String skillWDescription, String skillWImageURL, String skillE, String skillEDescription,
            String skillEImageURL, String skillR, String skillRDescription, String skillRImageURL, String imageURL, String linkURL) {
        this.name = name;
        this.description = description;
        this.skillQ = skillQ;
        this.skillQDescription = skillQDescription;
        this.skillQImageURL = skillQImageURL;
        this.skillW = skillW;
        this.skillWDescription = skillWDescription;
        this.skillWImageURL = skillWImageURL;
        this.skillE = skillE;
        this.skillEDescription = skillEDescription;
        this.skillEImageURL = skillEImageURL;
        this.skillR = skillR;
        this.skillRDescription = skillRDescription;
        this.skillRImageURL = skillRImageURL;
        this.skillP = skillP;
        this.skillPDescription = skillPDescription;
        this.skillPImageURL = skillPImageURL;
        this.imageURL = imageURL;
        this.linkURL = linkURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkillQ() {
        return skillQ;
    }

    public void setSkillQ(String skillQ) {
        this.skillQ = skillQ;
    }

    public String getSkillQDescription() {
        return skillQDescription;
    }

    public void setSkillQDescription(String skillQDescription) {
        this.skillQDescription = skillQDescription;
    }

    public String getSkillQImageURL() {
        return skillQImageURL;
    }

    public void setSkillQImageURL(String skillQImageURL) {
        this.skillQImageURL = skillQImageURL;
    }

    public String getSkillW() {
        return skillW;
    }

    public void setSkillW(String skillW) {
        this.skillW = skillW;
    }

    public String getSkillWDescription() {
        return skillWDescription;
    }

    public void setSkillWDescription(String skillWDescription) {
        this.skillWDescription = skillWDescription;
    }

    public String getSkillWImageURL() {
        return skillWImageURL;
    }

    public void setSkillWImageURL(String skillWImageURL) {
        this.skillWImageURL = skillWImageURL;
    }

    public String getSkillE() {
        return skillE;
    }

    public void setSkillE(String skillE) {
        this.skillE = skillE;
    }

    public String getSkillEDescription() {
        return skillEDescription;
    }

    public void setSkillEDescription(String skillEDescription) {
        this.skillEDescription = skillEDescription;
    }

    public String getSkillEImageURL() {
        return skillEImageURL;
    }

    public void setSkillEImageURL(String skillEImageURL) {
        this.skillEImageURL = skillEImageURL;
    }

    public String getSkillR() {
        return skillR;
    }

    public void setSkillR(String skillR) {
        this.skillR = skillR;
    }

    public String getSkillRDescription() {
        return skillRDescription;
    }

    public void setSkillRDescription(String skillRDescription) {
        this.skillRDescription = skillRDescription;
    }

    public String getSkillRImageURL() {
        return skillRImageURL;
    }

    public void setSkillRImageURL(String skillRImageURL) {
        this.skillRImageURL = skillRImageURL;
    }

    public String getSkillP() {
        return skillP;
    }

    public void setSkillP(String skillP) {
        this.skillP = skillP;
    }

    public String getSkillPDescription() {
        return skillPDescription;
    }

    public void setSkillPDescription(String skillPDescription) {
        this.skillPDescription = skillPDescription;
    }

    public String getSkillPImageURL() {
        return skillPImageURL;
    }

    public void setSkillPImageURL(String skillPImageURL) {
        this.skillPImageURL = skillPImageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((skillQ == null) ? 0 : skillQ.hashCode());
        result = prime * result + ((skillQDescription == null) ? 0 : skillQDescription.hashCode());
        result = prime * result + ((skillQImageURL == null) ? 0 : skillQImageURL.hashCode());
        result = prime * result + ((skillW == null) ? 0 : skillW.hashCode());
        result = prime * result + ((skillWDescription == null) ? 0 : skillWDescription.hashCode());
        result = prime * result + ((skillWImageURL == null) ? 0 : skillWImageURL.hashCode());
        result = prime * result + ((skillE == null) ? 0 : skillE.hashCode());
        result = prime * result + ((skillEDescription == null) ? 0 : skillEDescription.hashCode());
        result = prime * result + ((skillEImageURL == null) ? 0 : skillEImageURL.hashCode());
        result = prime * result + ((skillR == null) ? 0 : skillR.hashCode());
        result = prime * result + ((skillRDescription == null) ? 0 : skillRDescription.hashCode());
        result = prime * result + ((skillRImageURL == null) ? 0 : skillRImageURL.hashCode());
        result = prime * result + ((skillP == null) ? 0 : skillP.hashCode());
        result = prime * result + ((skillPDescription == null) ? 0 : skillPDescription.hashCode());
        result = prime * result + ((skillPImageURL == null) ? 0 : skillPImageURL.hashCode());
        result = prime * result + ((imageURL == null) ? 0 : imageURL.hashCode());
        result = prime * result + ((linkURL == null) ? 0 : linkURL.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Champion other = (Champion) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (skillQ == null) {
            if (other.skillQ != null)
                return false;
        } else if (!skillQ.equals(other.skillQ))
            return false;
        if (skillQDescription == null) {
            if (other.skillQDescription != null)
                return false;
        } else if (!skillQDescription.equals(other.skillQDescription))
            return false;
        if (skillQImageURL == null) {
            if (other.skillQImageURL != null)
                return false;
        } else if (!skillQImageURL.equals(other.skillQImageURL))
            return false;
        if (skillW == null) {
            if (other.skillW != null)
                return false;
        } else if (!skillW.equals(other.skillW))
            return false;
        if (skillWDescription == null) {
            if (other.skillWDescription != null)
                return false;
        } else if (!skillWDescription.equals(other.skillWDescription))
            return false;
        if (skillWImageURL == null) {
            if (other.skillWImageURL != null)
                return false;
        } else if (!skillWImageURL.equals(other.skillWImageURL))
            return false;
        if (skillE == null) {
            if (other.skillE != null)
                return false;
        } else if (!skillE.equals(other.skillE))
            return false;
        if (skillEDescription == null) {
            if (other.skillEDescription != null)
                return false;
        } else if (!skillEDescription.equals(other.skillEDescription))
            return false;
        if (skillEImageURL == null) {
            if (other.skillEImageURL != null)
                return false;
        } else if (!skillEImageURL.equals(other.skillEImageURL))
            return false;
        if (skillR == null) {
            if (other.skillR != null)
                return false;
        } else if (!skillR.equals(other.skillR))
            return false;
        if (skillRDescription == null) {
            if (other.skillRDescription != null)
                return false;
        } else if (!skillRDescription.equals(other.skillRDescription))
            return false;
        if (skillRImageURL == null) {
            if (other.skillRImageURL != null)
                return false;
        } else if (!skillRImageURL.equals(other.skillRImageURL))
            return false;
        if (skillP == null) {
            if (other.skillP != null)
                return false;
        } else if (!skillP.equals(other.skillP))
            return false;
        if (skillPDescription == null) {
            if (other.skillPDescription != null)
                return false;
        } else if (!skillPDescription.equals(other.skillPDescription))
            return false;
        if (skillPImageURL == null) {
            if (other.skillPImageURL != null)
                return false;
        } else if (!skillPImageURL.equals(other.skillPImageURL))
            return false;
        if (imageURL == null) {
            if (other.imageURL != null)
                return false;
        } else if (!imageURL.equals(other.imageURL))
            return false;
        if (linkURL == null) {
            if (other.linkURL != null)
                return false;
        } else if (!linkURL.equals(other.linkURL))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Champion [name=" + name + ", description=" + description + ", skillQ=" + skillQ + ", skillQDescription="
                + skillQDescription + ", skillQImageURL=" + skillQImageURL + ", skillW=" + skillW
                + ", skillWDescription=" + skillWDescription + ", skillWImageURL=" + skillWImageURL + ", skillE="
                + skillE + ", skillEDescription=" + skillEDescription + ", skillEImageURL=" + skillEImageURL
                + ", skillR=" + skillR + ", skillRDescription=" + skillRDescription + ", skillRImageURL="
                + skillRImageURL + ", skillP=" + skillP + ", skillPDescription=" + skillPDescription
                + ", skillPImageURL=" + skillPImageURL + ", imageURL=" + imageURL + ", linkURL=" + linkURL + "]";
    }



    
}
