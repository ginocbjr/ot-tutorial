package com.ideyatech.ot.tutorial.dao.impl;

import org.opentides.dao.impl.BaseEntityDaoJpaImpl;
import org.springframework.stereotype.Repository;

import com.ideyatech.ot.tutorial.entity.Skill;

@Repository("skillDao")
public class SkillDaoJpaImpl extends BaseEntityDaoJpaImpl<Skill, Long> {

}
