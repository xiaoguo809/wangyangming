package com.bgy.customerwaterscore.model;

import java.util.ArrayList;
import java.util.List;

public class IconDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IconDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIconTypeIsNull() {
            addCriterion("icon_type is null");
            return (Criteria) this;
        }

        public Criteria andIconTypeIsNotNull() {
            addCriterion("icon_type is not null");
            return (Criteria) this;
        }

        public Criteria andIconTypeEqualTo(Integer value) {
            addCriterion("icon_type =", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeNotEqualTo(Integer value) {
            addCriterion("icon_type <>", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeGreaterThan(Integer value) {
            addCriterion("icon_type >", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("icon_type >=", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeLessThan(Integer value) {
            addCriterion("icon_type <", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeLessThanOrEqualTo(Integer value) {
            addCriterion("icon_type <=", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeIn(List<Integer> values) {
            addCriterion("icon_type in", values, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeNotIn(List<Integer> values) {
            addCriterion("icon_type not in", values, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeBetween(Integer value1, Integer value2) {
            addCriterion("icon_type between", value1, value2, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("icon_type not between", value1, value2, "iconType");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeIsNull() {
            addCriterion("icon_file_type is null");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeIsNotNull() {
            addCriterion("icon_file_type is not null");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeEqualTo(Integer value) {
            addCriterion("icon_file_type =", value, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeNotEqualTo(Integer value) {
            addCriterion("icon_file_type <>", value, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeGreaterThan(Integer value) {
            addCriterion("icon_file_type >", value, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("icon_file_type >=", value, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeLessThan(Integer value) {
            addCriterion("icon_file_type <", value, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeLessThanOrEqualTo(Integer value) {
            addCriterion("icon_file_type <=", value, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeIn(List<Integer> values) {
            addCriterion("icon_file_type in", values, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeNotIn(List<Integer> values) {
            addCriterion("icon_file_type not in", values, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeBetween(Integer value1, Integer value2) {
            addCriterion("icon_file_type between", value1, value2, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("icon_file_type not between", value1, value2, "iconFileType");
            return (Criteria) this;
        }

        public Criteria andIconFileIdIsNull() {
            addCriterion("icon_file_id is null");
            return (Criteria) this;
        }

        public Criteria andIconFileIdIsNotNull() {
            addCriterion("icon_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andIconFileIdEqualTo(Long value) {
            addCriterion("icon_file_id =", value, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdNotEqualTo(Long value) {
            addCriterion("icon_file_id <>", value, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdGreaterThan(Long value) {
            addCriterion("icon_file_id >", value, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("icon_file_id >=", value, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdLessThan(Long value) {
            addCriterion("icon_file_id <", value, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdLessThanOrEqualTo(Long value) {
            addCriterion("icon_file_id <=", value, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdIn(List<Long> values) {
            addCriterion("icon_file_id in", values, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdNotIn(List<Long> values) {
            addCriterion("icon_file_id not in", values, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdBetween(Long value1, Long value2) {
            addCriterion("icon_file_id between", value1, value2, "iconFileId");
            return (Criteria) this;
        }

        public Criteria andIconFileIdNotBetween(Long value1, Long value2) {
            addCriterion("icon_file_id not between", value1, value2, "iconFileId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}